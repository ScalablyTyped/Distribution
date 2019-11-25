package typings.newman.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunFailure extends js.Object {
  /** The event where the failure occurred */
  var at: String
  var error: NewmanRunExecutionAssertionError
}

object NewmanRunFailure {
  @scala.inline
  def apply(at: String, error: NewmanRunExecutionAssertionError): NewmanRunFailure = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewmanRunFailure]
  }
}

