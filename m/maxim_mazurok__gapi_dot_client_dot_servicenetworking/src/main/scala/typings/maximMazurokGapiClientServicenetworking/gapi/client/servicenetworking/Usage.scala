package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Usage extends StObject {
  
  /**
    * The full resource name of a channel used for sending notifications to the service producer. Google Service Management currently only supports [Google Cloud
    * Pub/Sub](https://cloud.google.com/pubsub) as a notification channel. To use Google Cloud Pub/Sub as the channel, this must be the name of a Cloud Pub/Sub topic that uses the Cloud
    * Pub/Sub topic name format documented in https://cloud.google.com/pubsub/docs/overview.
    */
  var producerNotificationChannel: js.UndefOr[String] = js.undefined
  
  /** Requirements that must be satisfied before a consumer project can use the service. Each requirement is of the form /; for example 'serviceusage.googleapis.com/billing-enabled'. */
  var requirements: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of usage rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order. */
  var rules: js.UndefOr[js.Array[UsageRule]] = js.undefined
}
object Usage {
  
  inline def apply(): Usage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usage]
  }
  
  extension [Self <: Usage](x: Self) {
    
    inline def setProducerNotificationChannel(value: String): Self = StObject.set(x, "producerNotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setProducerNotificationChannelUndefined: Self = StObject.set(x, "producerNotificationChannel", js.undefined)
    
    inline def setRequirements(value: js.Array[String]): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setRequirementsVarargs(value: String*): Self = StObject.set(x, "requirements", js.Array(value :_*))
    
    inline def setRules(value: js.Array[UsageRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: UsageRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
