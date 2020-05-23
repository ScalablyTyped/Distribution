package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
trait Error extends js.Object {
  /** Error code string, such as "InvalidArgument". */
  var code: String
  /** Debug info (useful for detailed logging of the error, i.e., via `JSON.stringify(...)`). */
  var debugInfo: DebugInfo
  /** Inner error, if applicable. */
  var innerError: Error
  /** The error message passed through from the host Office application. */
  var message: String
  /** Error name: "OfficeExtension.Error".*/
  var name: String
  /** Stack trace, if applicable. */
  var stack: String
  /**
    * Trace messages (if any) that were added via a `context.trace()` invocation before calling `context.sync()`.
    * If there was an error, this contains all trace messages that were executed before the error occurred.
    * These messages can help you monitor the program execution sequence and detect the case of the error.
    */
  var traceMessages: js.Array[String]
}

object Error {
  @scala.inline
  def apply(
    code: String,
    debugInfo: DebugInfo,
    innerError: Error,
    message: String,
    name: String,
    stack: String,
    traceMessages: js.Array[String]
  ): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], debugInfo = debugInfo.asInstanceOf[js.Any], innerError = innerError.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], traceMessages = traceMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

