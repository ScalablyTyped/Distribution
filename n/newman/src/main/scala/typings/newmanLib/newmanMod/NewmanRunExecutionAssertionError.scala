package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunExecutionAssertionError extends js.Object {
  var index: scala.Double
  var message: java.lang.String
  var name: java.lang.String
  var stack: java.lang.String
  var test: java.lang.String
}

object NewmanRunExecutionAssertionError {
  @scala.inline
  def apply(
    index: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String,
    test: java.lang.String
  ): NewmanRunExecutionAssertionError = {
    val __obj = js.Dynamic.literal(index = index, message = message, name = name, stack = stack, test = test)
  
    __obj.asInstanceOf[NewmanRunExecutionAssertionError]
  }
}

