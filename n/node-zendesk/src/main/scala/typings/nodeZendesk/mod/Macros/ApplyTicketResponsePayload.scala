package typings.nodeZendesk.mod.Macros

import typings.nodeZendesk.anon.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyTicketResponsePayload extends js.Object {
  
  var result: Comment = js.native
}
object ApplyTicketResponsePayload {
  
  @scala.inline
  def apply(result: Comment): ApplyTicketResponsePayload = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyTicketResponsePayload]
  }
  
  @scala.inline
  implicit class ApplyTicketResponsePayloadOps[Self <: ApplyTicketResponsePayload] (val x: Self) extends AnyVal {
    
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
    def setResult(value: Comment): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
