package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpIssue extends StObject {
  
  /** Brief description of this issue. */
  var issueMessage: js.UndefOr[String] = js.undefined
  
  /** Severity of this issue: WARNING or ERROR. */
  var severity: js.UndefOr[String] = js.undefined
}
object AmpIssue {
  
  inline def apply(): AmpIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpIssue]
  }
  
  extension [Self <: AmpIssue](x: Self) {
    
    inline def setIssueMessage(value: String): Self = StObject.set(x, "issueMessage", value.asInstanceOf[js.Any])
    
    inline def setIssueMessageUndefined: Self = StObject.set(x, "issueMessage", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
