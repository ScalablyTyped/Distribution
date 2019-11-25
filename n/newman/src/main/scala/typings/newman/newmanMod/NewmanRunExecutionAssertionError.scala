package typings.newman.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunExecutionAssertionError extends js.Object {
  var index: Double
  var message: String
  var name: String
  var stack: String
  var test: String
}

object NewmanRunExecutionAssertionError {
  @scala.inline
  def apply(index: Double, message: String, name: String, stack: String, test: String): NewmanRunExecutionAssertionError = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewmanRunExecutionAssertionError]
  }
}

