package typings
package nodeLib.assertMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionError
  extends nodeLib.Error {
  var actual: js.Any
  var code: nodeLib.nodeLibStrings.ERR_ASSERTION
  var expected: js.Any
  var generatedMessage: scala.Boolean
  var message: java.lang.String
  var name: java.lang.String
  var operator: java.lang.String
}

object AssertionError {
  @scala.inline
  def apply(
    actual: js.Any,
    code: nodeLib.nodeLibStrings.ERR_ASSERTION,
    expected: js.Any,
    generatedMessage: scala.Boolean,
    message: java.lang.String,
    name: java.lang.String,
    operator: java.lang.String,
    stack: java.lang.String = null
  ): AssertionError = {
    val __obj = js.Dynamic.literal(actual = actual, code = code, expected = expected, generatedMessage = generatedMessage, message = message, name = name, operator = operator)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AssertionError]
  }
}

