package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2Condition extends StObject {
  
  /** A reason for the execution condition. */
  var executionReason: js.UndefOr[String] = js.undefined
  
  /** Last time the condition transitioned from one status to another. */
  var lastTransitionTime: js.UndefOr[String] = js.undefined
  
  /** Human readable message indicating details about the current status. */
  var message: js.UndefOr[String] = js.undefined
  
  /** A common (service-level) reason for this condition. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** A reason for the revision condition. */
  var revisionReason: js.UndefOr[String] = js.undefined
  
  /** How to interpret failures of this condition, one of Error, Warning, Info */
  var severity: js.UndefOr[String] = js.undefined
  
  /** State of the condition. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * type is used to communicate the status of the reconciliation process. See also: https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting Types
    * common to all resources include: * "Ready": True when the Resource is ready.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2Condition {
  
  inline def apply(): GoogleCloudRunV2Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2Condition] (val x: Self) extends AnyVal {
    
    inline def setExecutionReason(value: String): Self = StObject.set(x, "executionReason", value.asInstanceOf[js.Any])
    
    inline def setExecutionReasonUndefined: Self = StObject.set(x, "executionReason", js.undefined)
    
    inline def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRevisionReason(value: String): Self = StObject.set(x, "revisionReason", value.asInstanceOf[js.Any])
    
    inline def setRevisionReasonUndefined: Self = StObject.set(x, "revisionReason", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
