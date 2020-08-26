package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignInStatus extends js.Object {
  // Provides additional details on the sign-in activity
  var additionalDetails: js.UndefOr[String] = js.native
  /**
    * Provides the 5-6digit error code that's generated during a sign-in failure. Check out the list of error codes and
    * messages.
    */
  var errorCode: js.UndefOr[Double] = js.native
  /**
    * Provides the error message or the reason for failure for the corresponding sign-in activity. Check out the list of
    * error codes and messages.
    */
  var failureReason: js.UndefOr[String] = js.native
}

object SignInStatus {
  @scala.inline
  def apply(): SignInStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInStatus]
  }
  @scala.inline
  implicit class SignInStatusOps[Self <: SignInStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalDetails(value: String): Self = this.set("additionalDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalDetails: Self = this.set("additionalDetails", js.undefined)
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
  }
  
}

