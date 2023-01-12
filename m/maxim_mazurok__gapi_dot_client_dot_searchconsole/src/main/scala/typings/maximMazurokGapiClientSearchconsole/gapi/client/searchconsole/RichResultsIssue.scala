package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichResultsIssue extends StObject {
  
  /** Rich Results issue type. */
  var issueMessage: js.UndefOr[String] = js.undefined
  
  /** Severity of this issue: WARNING, or ERROR. Items with an issue of status ERROR cannot appear with rich result features in Google Search results. */
  var severity: js.UndefOr[String] = js.undefined
}
object RichResultsIssue {
  
  inline def apply(): RichResultsIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichResultsIssue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichResultsIssue] (val x: Self) extends AnyVal {
    
    inline def setIssueMessage(value: String): Self = StObject.set(x, "issueMessage", value.asInstanceOf[js.Any])
    
    inline def setIssueMessageUndefined: Self = StObject.set(x, "issueMessage", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
