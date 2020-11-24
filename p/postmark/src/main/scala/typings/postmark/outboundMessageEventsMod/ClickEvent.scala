package typings.postmark.outboundMessageEventsMod

import typings.postmark.anon.ClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickEvent extends MessageEvent {
  
  @JSName("Details")
  var Details_ClickEvent: ClickLocation = js.native
}
object ClickEvent {
  
  @scala.inline
  def apply(Details: ClickLocation, ReceivedAt: String, Recipient: String, Type: String): ClickEvent = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickEvent]
  }
  
  @scala.inline
  implicit class ClickEventOps[Self <: ClickEvent] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: ClickLocation): Self = this.set("Details", value.asInstanceOf[js.Any])
  }
}
