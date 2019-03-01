package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunFailure extends js.Object {
  /** The event where the failure occurred */
  var at: java.lang.String
  var error: NewmanRunExecutionAssertionError
}

object NewmanRunFailure {
  @scala.inline
  def apply(at: java.lang.String, error: NewmanRunExecutionAssertionError): NewmanRunFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("at")(at)
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[NewmanRunFailure]
  }
}

