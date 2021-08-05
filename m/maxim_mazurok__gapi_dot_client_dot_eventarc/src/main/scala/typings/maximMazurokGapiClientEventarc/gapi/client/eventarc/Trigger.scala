package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trigger extends StObject {
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. Destinations specify where the events will be sent to. Exactly one destination is supported at this time. */
  var destination: js.UndefOr[Destination] = js.undefined
  
  /**
    * Output only. This checksum is computed by the server based on the value of other fields, and may be sent only on create requests to ensure the client has an up-to-date value before
    * proceeding.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Required. The criteria by which events are filtered. Only events that match with this critera will be sent to the destinations. */
  var matchingCriteria: js.UndefOr[js.Array[MatchingCriteria]] = js.undefined
  
  /** Required. The resource name of the trigger. Must be unique within the location on the project. Format: projects/{project}/locations/{location}/triggers/{trigger} */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The IAM service account email associated with the trigger. The service account represents the identity of the trigger. The principal who calls this API must have
    * `iam.serviceAccounts.actAs` permission in the service account. See https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more information. For Cloud
    * Run destinations, this service account is used to generate identity tokens when invoking the service. See
    * https://cloud.google.com/run/docs/triggering/pubsub-push#create-service-account for information on how to invoke authenticated Cloud Run services. In order to create Audit Log
    * triggers, the service account should also have 'eventarc.events.receiveAuditLogV1Written' permission.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. In order to deliver messages, Eventarc may configure other GCP products as transport intermediary. This field returns a reference to that transport intermediary. This
    * information can be used for debugging purposes.
    */
  var transport: js.UndefOr[Transport] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Trigger {
  
  inline def apply(): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trigger]
  }
  
  extension [Self <: Trigger](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setMatchingCriteria(value: js.Array[MatchingCriteria]): Self = StObject.set(x, "matchingCriteria", value.asInstanceOf[js.Any])
    
    inline def setMatchingCriteriaUndefined: Self = StObject.set(x, "matchingCriteria", js.undefined)
    
    inline def setMatchingCriteriaVarargs(value: MatchingCriteria*): Self = StObject.set(x, "matchingCriteria", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
