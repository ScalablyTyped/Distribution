package typings.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
@js.native
trait Error extends js.Object {
  /** Error code string, such as "InvalidArgument". */
  var code: String = js.native
  /** Debug info (useful for detailed logging of the error, i.e., via `JSON.stringify(...)`). */
  var debugInfo: DebugInfo = js.native
  /** Inner error, if applicable. */
  var innerError: Error = js.native
  /** The error message passed through from the host Office application. */
  var message: String = js.native
  /** Error name: "OfficeExtension.Error".*/
  var name: String = js.native
  /** Stack trace, if applicable. */
  var stack: String = js.native
  /**
    * Trace messages (if any) that were added via a `context.trace()` invocation before calling `context.sync()`. 
    * If there was an error, this contains all trace messages that were executed before the error occurred. 
    * These messages can help you monitor the program execution sequence and detect the case of the error.
    */
  var traceMessages: js.Array[String] = js.native
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
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugInfo(value: DebugInfo): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerError(value: Error): Self = this.set("innerError", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraceMessagesVarargs(value: String*): Self = this.set("traceMessages", js.Array(value :_*))
    @scala.inline
    def setTraceMessages(value: js.Array[String]): Self = this.set("traceMessages", value.asInstanceOf[js.Any])
  }
  
}

