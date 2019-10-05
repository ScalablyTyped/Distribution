package typings.officeDashJsDashPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The error object returned by `context.sync()`, if a promise is rejected due to an error while processing the request. */
@JSGlobal("OfficeExtension.Error")
@js.native
class Error () extends js.Object {
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

