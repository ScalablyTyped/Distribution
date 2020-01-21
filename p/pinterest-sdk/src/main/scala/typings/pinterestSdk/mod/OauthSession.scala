package typings.pinterestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthSession extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object OauthSession {
  @scala.inline
  def apply(accessToken: String = null, error: String = null, scope: String = null): OauthSession = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthSession]
  }
}

