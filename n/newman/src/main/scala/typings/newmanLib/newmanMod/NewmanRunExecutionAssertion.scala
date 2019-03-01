package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunExecutionAssertion extends js.Object {
  var assertion: java.lang.String
  var error: NewmanRunExecutionAssertionError
}

object NewmanRunExecutionAssertion {
  @scala.inline
  def apply(assertion: java.lang.String, error: NewmanRunExecutionAssertionError): NewmanRunExecutionAssertion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assertion")(assertion)
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[NewmanRunExecutionAssertion]
  }
}

