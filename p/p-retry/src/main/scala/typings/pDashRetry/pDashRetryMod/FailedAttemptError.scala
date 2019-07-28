package typings.pDashRetry.pDashRetryMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedAttemptError extends Error {
  val attemptNumber: Double
  val retriesLeft: Double
}

object FailedAttemptError {
  @scala.inline
  def apply(attemptNumber: Double, message: String, name: String, retriesLeft: Double, stack: String = null): FailedAttemptError = {
    val __obj = js.Dynamic.literal(attemptNumber = attemptNumber, message = message, name = name, retriesLeft = retriesLeft)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FailedAttemptError]
  }
}

