package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hl7V2NotificationConfig extends js.Object {
  
  /**
    * Restricts notifications sent for messages matching a filter. If this is empty, all messages are matched. Syntax:
    * https://cloud.google.com/appengine/docs/standard/python/search/query_strings The following fields and functions are available for filtering: * `message_type`, from the MSH-9.1
    * field. For example, `NOT message_type = "ADT"`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone, from the MSH-7 segment. For
    * example, `send_date < "2017-01-02"`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example,
    * `send_time < "2017-01-02T00:00:00-05:00"`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = "ABC"`. *
    * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example,
    * `PatientId("123456", "MRN")`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels."priority"="high"`. The operator `:*`
    * can be used to assert the existence of a label. For example, `labels."priority":*`.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The [Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. The notification is a `PubsubMessage` with
    * the following fields: * `PubsubMessage.Data` contains the resource name. * `PubsubMessage.MessageId` is the ID of this notification. It's guaranteed to be unique within the topic. *
    * `PubsubMessage.PublishTime` is the time when the message was published. Note that notifications are only sent if the topic is non-empty. [Topic
    * names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. The Cloud Healthcare API service account,
    * service-PROJECT_NUMBER@gcp-sa-healthcare.iam.gserviceaccount.com, must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that
    * send notifications to fail. If a notification cannot be published to Cloud Pub/Sub, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud
    * Logging](/healthcare/docs/how-tos/logging)).
    */
  var pubsubTopic: js.UndefOr[String] = js.native
}
object Hl7V2NotificationConfig {
  
  @scala.inline
  def apply(): Hl7V2NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hl7V2NotificationConfig]
  }
  
  @scala.inline
  implicit class Hl7V2NotificationConfigOps[Self <: Hl7V2NotificationConfig] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPubsubTopic(value: String): Self = this.set("pubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubTopic: Self = this.set("pubsubTopic", js.undefined)
  }
}
