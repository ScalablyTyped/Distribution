package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRequest extends js.Object {
  /**
    * A function that is called if the token request fails, with the reason for the failure.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  /**
    * A function that is called if the token request succeeds, with the resulting token.
    */
  var successCallback: js.UndefOr[js.Function1[/* user */ UserProfile, Unit]] = js.undefined
}

object UserRequest {
  @scala.inline
  def apply(
    failureCallback: /* reason */ String => Unit = null,
    successCallback: /* user */ UserProfile => Unit = null
  ): UserRequest = {
    val __obj = js.Dynamic.literal()
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(js.Any.fromFunction1(failureCallback))
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction1(successCallback))
    __obj.asInstanceOf[UserRequest]
  }
}

