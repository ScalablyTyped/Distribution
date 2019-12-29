package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about exception (or error) that was thrown during script compilation or execution.
  */
trait ExceptionDetails extends js.Object {
  /**
    * Column number of the exception location (0-based).
    */
  var columnNumber: Double
  /**
    * Exception object if available.
    */
  var exception: js.UndefOr[RemoteObject] = js.undefined
  /**
    * Exception id.
    */
  var exceptionId: Double
  /**
    * Identifier of the context where exception happened.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.undefined
  /**
    * Line number of the exception location (0-based).
    */
  var lineNumber: Double
  /**
    * Script ID of the exception location.
    */
  var scriptId: js.UndefOr[ScriptId] = js.undefined
  /**
    * JavaScript stack trace if available.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  /**
    * Exception text, which should be used together with exception object when available.
    */
  var text: String
  /**
    * URL of the exception location, to be used when the script was not reported.
    */
  var url: js.UndefOr[String] = js.undefined
}

object ExceptionDetails {
  @scala.inline
  def apply(
    columnNumber: Double,
    exceptionId: Double,
    lineNumber: Double,
    text: String,
    exception: RemoteObject = null,
    executionContextId: Int | Double = null,
    scriptId: ScriptId = null,
    stackTrace: StackTrace = null,
    url: String = null
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], exceptionId = exceptionId.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (executionContextId != null) __obj.updateDynamic("executionContextId")(executionContextId.asInstanceOf[js.Any])
    if (scriptId != null) __obj.updateDynamic("scriptId")(scriptId.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
}

