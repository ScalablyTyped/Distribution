package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2PubSubNotification extends StObject {
  
  /**
    * How much data to include in the Pub/Sub message. If the user wishes to limit the size of the message, they can use resource_name and fetch the profile fields they wish to. Per table
    * profile (not per column).
    */
  var detailOfMessage: js.UndefOr[String] = js.undefined
  
  /** The type of event that triggers a Pub/Sub. At most one `PubSubNotification` per EventType is permitted. */
  var event: js.UndefOr[String] = js.undefined
  
  /** Conditions (e.g., data risk or sensitivity level) for triggering a Pub/Sub. */
  var pubsubCondition: js.UndefOr[GooglePrivacyDlpV2DataProfilePubSubCondition] = js.undefined
  
  /** Cloud Pub/Sub topic to send notifications to. Format is projects/{project}/topics/{topic}. */
  var topic: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2PubSubNotification {
  
  inline def apply(): GooglePrivacyDlpV2PubSubNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PubSubNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2PubSubNotification] (val x: Self) extends AnyVal {
    
    inline def setDetailOfMessage(value: String): Self = StObject.set(x, "detailOfMessage", value.asInstanceOf[js.Any])
    
    inline def setDetailOfMessageUndefined: Self = StObject.set(x, "detailOfMessage", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setPubsubCondition(value: GooglePrivacyDlpV2DataProfilePubSubCondition): Self = StObject.set(x, "pubsubCondition", value.asInstanceOf[js.Any])
    
    inline def setPubsubConditionUndefined: Self = StObject.set(x, "pubsubCondition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
