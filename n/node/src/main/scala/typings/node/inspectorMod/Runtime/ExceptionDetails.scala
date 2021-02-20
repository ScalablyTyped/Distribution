package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information about exception (or error) that was thrown during script compilation or execution.
  */
@js.native
trait ExceptionDetails extends StObject {
  
  /**
    * Column number of the exception location (0-based).
    */
  var columnNumber: Double = js.native
  
  /**
    * Exception object if available.
    */
  var exception: js.UndefOr[RemoteObject] = js.native
  
  /**
    * Exception id.
    */
  var exceptionId: Double = js.native
  
  /**
    * Identifier of the context where exception happened.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  
  /**
    * Line number of the exception location (0-based).
    */
  var lineNumber: Double = js.native
  
  /**
    * Script ID of the exception location.
    */
  var scriptId: js.UndefOr[ScriptId] = js.native
  
  /**
    * JavaScript stack trace if available.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Exception text, which should be used together with exception object when available.
    */
  var text: String = js.native
  
  /**
    * URL of the exception location, to be used when the script was not reported.
    */
  var url: js.UndefOr[String] = js.native
}
object ExceptionDetails {
  
  @scala.inline
  def apply(columnNumber: Double, exceptionId: Double, lineNumber: Double, text: String): ExceptionDetails = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], exceptionId = exceptionId.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
  
  @scala.inline
  implicit class ExceptionDetailsMutableBuilder[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setException(value: RemoteObject): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionId(value: Double): Self = StObject.set(x, "exceptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionContextIdUndefined: Self = StObject.set(x, "executionContextId", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    @scala.inline
    def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
