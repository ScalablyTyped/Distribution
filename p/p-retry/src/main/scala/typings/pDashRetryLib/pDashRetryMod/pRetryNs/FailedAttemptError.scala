package typings
package pDashRetryLib.pDashRetryMod.pRetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedAttemptError
  extends stdLib.Error {
  var attemptNumber: scala.Double
  var retriesLeft: scala.Double
}

object FailedAttemptError {
  @scala.inline
  def apply(
    attemptNumber: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    retriesLeft: scala.Double,
    stack: java.lang.String = null
  ): FailedAttemptError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attemptNumber")(attemptNumber)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("retriesLeft")(retriesLeft)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FailedAttemptError]
  }
}

