package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapSQL extends js.Object {
  
  var capSQL: js.UndefOr[Boolean] = js.native
}
object CapSQL {
  
  @scala.inline
  def apply(): CapSQL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapSQL]
  }
  
  @scala.inline
  implicit class CapSQLOps[Self <: CapSQL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapSQL(value: Boolean): Self = this.set("capSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapSQL: Self = this.set("capSQL", js.undefined)
  }
}
