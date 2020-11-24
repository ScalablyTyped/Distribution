package typings.openfin.shapesPlatformMod

import typings.openfin.shapesIdentityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseViewPayload extends js.Object {
  
  var view: Identity = js.native
}
object CloseViewPayload {
  
  @scala.inline
  def apply(view: Identity): CloseViewPayload = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseViewPayload]
  }
  
  @scala.inline
  implicit class CloseViewPayloadOps[Self <: CloseViewPayload] (val x: Self) extends AnyVal {
    
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
    def setView(value: Identity): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}
