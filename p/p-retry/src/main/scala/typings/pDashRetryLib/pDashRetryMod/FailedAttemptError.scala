package typings
package pDashRetryLib.pDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedAttemptError
  extends stdLib.Error {
  val attemptNumber: scala.Double
  val retriesLeft: scala.Double
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
    val __obj = js.Dynamic.literal(attemptNumber = attemptNumber, message = message, name = name, retriesLeft = retriesLeft)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FailedAttemptError]
  }
}

