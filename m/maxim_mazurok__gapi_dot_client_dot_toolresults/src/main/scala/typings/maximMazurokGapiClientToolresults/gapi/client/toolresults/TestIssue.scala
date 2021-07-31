package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestIssue extends StObject {
  
  /** Category of issue. Required. */
  var category: js.UndefOr[String] = js.undefined
  
  /** A brief human-readable message describing the issue. Required. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** Severity of issue. Required. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Deprecated in favor of stack trace fields inside specific warnings. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /** Type of issue. Required. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Warning message with additional details of the issue. Should always be a message from com.google.devtools.toolresults.v1.warnings */
  var warning: js.UndefOr[Any] = js.undefined
}
object TestIssue {
  
  @scala.inline
  def apply(): TestIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestIssue]
  }
  
  @scala.inline
  implicit class TestIssueMutableBuilder[Self <: TestIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWarning(value: Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
