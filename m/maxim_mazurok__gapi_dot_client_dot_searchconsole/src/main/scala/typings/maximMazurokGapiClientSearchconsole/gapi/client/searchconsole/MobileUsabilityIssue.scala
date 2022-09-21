package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileUsabilityIssue extends StObject {
  
  /** Mobile-usability issue type. */
  var issueType: js.UndefOr[String] = js.undefined
  
  /** Additional information regarding the issue. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Not returned; reserved for future use. */
  var severity: js.UndefOr[String] = js.undefined
}
object MobileUsabilityIssue {
  
  inline def apply(): MobileUsabilityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileUsabilityIssue]
  }
  
  extension [Self <: MobileUsabilityIssue](x: Self) {
    
    inline def setIssueType(value: String): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
