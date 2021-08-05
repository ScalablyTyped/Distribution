package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveStreamConfigurationIssue extends StObject {
  
  /** The long-form description of the issue and how to resolve it. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The short-form reason for this issue. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** How severe this issue is to the stream. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** The kind of error happening. */
  var `type`: js.UndefOr[String] = js.undefined
}
object LiveStreamConfigurationIssue {
  
  inline def apply(): LiveStreamConfigurationIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamConfigurationIssue]
  }
  
  extension [Self <: LiveStreamConfigurationIssue](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
