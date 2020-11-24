package typings.meteorAstronomy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Old extends js.Object {
  
  var old: js.UndefOr[Boolean] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
}
object Old {
  
  @scala.inline
  def apply(): Old = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Old]
  }
  
  @scala.inline
  implicit class OldOps[Self <: Old] (val x: Self) extends AnyVal {
    
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
    def setOld(value: Boolean): Self = this.set("old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOld: Self = this.set("old", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
