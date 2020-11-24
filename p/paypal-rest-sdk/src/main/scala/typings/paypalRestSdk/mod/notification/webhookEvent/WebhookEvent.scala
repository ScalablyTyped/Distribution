package typings.paypalRestSdk.mod.notification.webhookEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookEvent extends js.Object {
  
  val create_time: js.UndefOr[String] = js.native
  
  val event_type: js.UndefOr[String] = js.native
  
  val event_version: js.UndefOr[String] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val resource: js.UndefOr[js.Any] = js.native
  
  val resource_type: js.UndefOr[String] = js.native
  
  val summary: js.UndefOr[String] = js.native
}
object WebhookEvent {
  
  @scala.inline
  def apply(): WebhookEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookEvent]
  }
  
  @scala.inline
  implicit class WebhookEventOps[Self <: WebhookEvent] (val x: Self) extends AnyVal {
    
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
    def setCreate_time(value: String): Self = this.set("create_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate_time: Self = this.set("create_time", js.undefined)
    
    @scala.inline
    def setEvent_type(value: String): Self = this.set("event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_type: Self = this.set("event_type", js.undefined)
    
    @scala.inline
    def setEvent_version(value: String): Self = this.set("event_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_version: Self = this.set("event_version", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setResource(value: js.Any): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResource_type(value: String): Self = this.set("resource_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource_type: Self = this.set("resource_type", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
