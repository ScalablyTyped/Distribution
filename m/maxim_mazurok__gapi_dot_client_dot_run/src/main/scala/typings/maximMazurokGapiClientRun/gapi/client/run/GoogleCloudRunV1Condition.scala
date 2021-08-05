package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV1Condition extends StObject {
  
  /** Optional. Last time the condition transitioned from one status to another. */
  var lastTransitionTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Human readable message indicating details about the current status. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Optional. One-word CamelCase reason for the condition's last transition. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** Optional. How to interpret failures of this condition, one of Error, Warning, Info */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Status of the condition, one of True, False, Unknown. */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-reporting
    * Types common to all resources include: * "Ready": True when the Resource is ready.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV1Condition {
  
  inline def apply(): GoogleCloudRunV1Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV1Condition]
  }
  
  extension [Self <: GoogleCloudRunV1Condition](x: Self) {
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
