package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfig extends js.Object {
  
  /** Event types for which a notification is desired. If empty, send notifications for all event types. */
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The desired format of the notification message payloads. */
  var payloadFormat: js.UndefOr[String] = js.native
  
  /**
    * Required. The `Topic.name` of the Cloud Pub/Sub topic to which to publish notifications. Must be of the format: `projects/{project}/topics/{topic}`. Not matching this format will
    * result in an INVALID_ARGUMENT error.
    */
  var pubsubTopic: js.UndefOr[String] = js.native
}
object NotificationConfig {
  
  @scala.inline
  def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  @scala.inline
  implicit class NotificationConfigOps[Self <: NotificationConfig] (val x: Self) extends AnyVal {
    
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
    def setEventTypesVarargs(value: String*): Self = this.set("eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypes(value: js.Array[String]): Self = this.set("eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypes: Self = this.set("eventTypes", js.undefined)
    
    @scala.inline
    def setPayloadFormat(value: String): Self = this.set("payloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadFormat: Self = this.set("payloadFormat", js.undefined)
    
    @scala.inline
    def setPubsubTopic(value: String): Self = this.set("pubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubTopic: Self = this.set("pubsubTopic", js.undefined)
  }
}
