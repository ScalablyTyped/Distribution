package typings.pRetry.mod

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
    val __obj = js.Dynamic.literal(attemptNumber = attemptNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retriesLeft = retriesLeft.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedAttemptError]
  }
}

