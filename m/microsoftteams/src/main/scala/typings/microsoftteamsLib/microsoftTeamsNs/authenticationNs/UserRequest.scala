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

