package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignInStatus extends js.Object {
  // Provides additional details on the sign-in activity
  var additionalDetails: js.UndefOr[String] = js.undefined
  /**
    * Provides the 5-6digit error code that's generated during a sign-in failure. Check out the list of error codes and
    * messages.
    */
  var errorCode: js.UndefOr[Double] = js.undefined
  /**
    * Provides the error message or the reason for failure for the corresponding sign-in activity. Check out the list of
    * error codes and messages.
    */
  var failureReason: js.UndefOr[String] = js.undefined
}

object SignInStatus {
  @scala.inline
  def apply(additionalDetails: String = null, errorCode: Int | Double = null, failureReason: String = null): SignInStatus = {
    val __obj = js.Dynamic.literal()
    if (additionalDetails != null) __obj.updateDynamic("additionalDetails")(additionalDetails.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInStatus]
  }
}

