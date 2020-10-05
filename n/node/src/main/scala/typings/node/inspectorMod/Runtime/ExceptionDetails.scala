package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Detailed information about exception (or error) that was thrown during script compilation or execution.
  */
@js.native
trait ExceptionDetails extends js.Object {
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
  implicit class ExceptionDetailsOps[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionId(value: Double): Self = this.set("exceptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setException(value: RemoteObject): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionContextId: Self = this.set("executionContextId", js.undefined)
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptId: Self = this.set("scriptId", js.undefined)
    @scala.inline
    def setStackTrace(value: StackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

