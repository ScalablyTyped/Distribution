package typings.newman.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunExecutionAssertion extends js.Object {
  var assertion: String
  var error: NewmanRunExecutionAssertionError
}

object NewmanRunExecutionAssertion {
  @scala.inline
  def apply(assertion: String, error: NewmanRunExecutionAssertionError): NewmanRunExecutionAssertion = {
    val __obj = js.Dynamic.literal(assertion = assertion, error = error)
  
    __obj.asInstanceOf[NewmanRunExecutionAssertion]
  }
}

