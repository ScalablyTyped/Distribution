package typings
package microsoftteamsLib.microsoftTeamsNs.authenticationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRequest extends js.Object {
  /**
    * A function that is called if the token request fails, with the reason for the failure.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * A function that is called if the token request succeeds, with the resulting token.
    */
  var successCallback: js.UndefOr[js.Function1[/* user */ UserProfile, scala.Unit]] = js.undefined
}

object UserRequest {
  @scala.inline
  def apply(
    failureCallback: js.Function1[/* reason */ java.lang.String, scala.Unit] = null,
    successCallback: js.Function1[/* user */ UserProfile, scala.Unit] = null
  ): UserRequest = {
    val __obj = js.Dynamic.literal()
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(failureCallback)
    if (successCallback != null) __obj.updateDynamic("successCallback")(successCallback)
    __obj.asInstanceOf[UserRequest]
  }
}

