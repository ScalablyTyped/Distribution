package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ORIGINSCOPED extends js.Object {
  
  var ORIGIN_SCOPED: Boolean = js.native
}
object ORIGINSCOPED {
  
  @scala.inline
  def apply(ORIGIN_SCOPED: Boolean): ORIGINSCOPED = {
    val __obj = js.Dynamic.literal(ORIGIN_SCOPED = ORIGIN_SCOPED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ORIGINSCOPED]
  }
  
  @scala.inline
  implicit class ORIGINSCOPEDOps[Self <: ORIGINSCOPED] (val x: Self) extends AnyVal {
    
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
    def setORIGIN_SCOPED(value: Boolean): Self = this.set("ORIGIN_SCOPED", value.asInstanceOf[js.Any])
  }
}
