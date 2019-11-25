package typings.naverDashWhale.whale.devtools.inspectedWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluationExceptionInfo extends js.Object {
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var code: String
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var description: String
  /** Set if the error occurred on the DevTools side before the expression is evaluated, contains the array of the values that may be substituted into the description string to provide more information about the cause of the error. */
  var details: js.Array[_]
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var isError: Boolean
  /** Set if the evaluated code produces an unhandled exception. */
  var isException: Boolean
  /** Set if the evaluated code produces an unhandled exception. */
  var value: String
}

object EvaluationExceptionInfo {
  @scala.inline
  def apply(
    code: String,
    description: String,
    details: js.Array[_],
    isError: Boolean,
    isException: Boolean,
    value: String
  ): EvaluationExceptionInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], isError = isError.asInstanceOf[js.Any], isException = isException.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EvaluationExceptionInfo]
  }
}

