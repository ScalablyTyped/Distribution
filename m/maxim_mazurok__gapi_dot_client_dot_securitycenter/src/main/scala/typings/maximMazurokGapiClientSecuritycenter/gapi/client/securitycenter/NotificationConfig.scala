package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfig extends js.Object {
  
  /** The description of the notification config (max of 1024 characters). */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
    * "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
    */
  var name: js.UndefOr[String] = js.native
  
  /** The Pub/Sub topic to send notifications to. Its format is "projects/[project_id]/topics/[topic]". */
  var pubsubTopic: js.UndefOr[String] = js.native
  
  /** Output only. The service account that needs "pubsub.topics.publish" permission to publish to the Pub/Sub topic. */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** The config for triggering streaming-based notifications. */
  var streamingConfig: js.UndefOr[StreamingConfig] = js.native
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPubsubTopic(value: String): Self = this.set("pubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubTopic: Self = this.set("pubsubTopic", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setStreamingConfig(value: StreamingConfig): Self = this.set("streamingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingConfig: Self = this.set("streamingConfig", js.undefined)
  }
}
