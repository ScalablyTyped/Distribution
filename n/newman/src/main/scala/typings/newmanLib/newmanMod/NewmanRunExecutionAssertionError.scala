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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stack")(stack)
    __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[NewmanRunExecutionAssertionError]
  }
}

