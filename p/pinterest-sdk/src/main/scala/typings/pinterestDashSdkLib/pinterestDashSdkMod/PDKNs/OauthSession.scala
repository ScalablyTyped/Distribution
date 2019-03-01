package typings
package pinterestDashSdkLib.pinterestDashSdkMod.PDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthSession extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object OauthSession {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    error: java.lang.String = null,
    scope: java.lang.String = null
  ): OauthSession = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (error != null) __obj.updateDynamic("error")(error)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[OauthSession]
  }
}

