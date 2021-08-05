package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudManagedidentitiesV1beta1OpMetadata extends StObject {
  
  /** Output only. API version used to start the operation. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Identifies whether the user has requested cancellation of the operation. Operations that have successfully been cancelled have Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var requestedCancellation: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Server-defined resource path for the target of the operation. */
  var target: js.UndefOr[String] = js.undefined
  
  /** Output only. Name of the verb executed by the operation. */
  var verb: js.UndefOr[String] = js.undefined
}
object GoogleCloudManagedidentitiesV1beta1OpMetadata {
  
  inline def apply(): GoogleCloudManagedidentitiesV1beta1OpMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudManagedidentitiesV1beta1OpMetadata]
  }
  
  extension [Self <: GoogleCloudManagedidentitiesV1beta1OpMetadata](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setRequestedCancellation(value: Boolean): Self = StObject.set(x, "requestedCancellation", value.asInstanceOf[js.Any])
    
    inline def setRequestedCancellationUndefined: Self = StObject.set(x, "requestedCancellation", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
