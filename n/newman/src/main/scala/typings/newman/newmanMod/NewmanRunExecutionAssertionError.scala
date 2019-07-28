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
    val __obj = js.Dynamic.literal(index = index, message = message, name = name, stack = stack, test = test)
  
    __obj.asInstanceOf[NewmanRunExecutionAssertionError]
  }
}

