package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoginStyle extends js.Object {
  var loginStyle: js.UndefOr[java.lang.String] = js.undefined
  var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  var requestOfflineToken: js.UndefOr[scala.Boolean] = js.undefined
  var requestPermissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userEmail: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LoginStyle {
  @scala.inline
  def apply(
    loginStyle: java.lang.String = null,
    loginUrlParameters: js.Object = null,
    redirectUrl: java.lang.String = null,
    requestOfflineToken: js.UndefOr[scala.Boolean] = js.undefined,
    requestPermissions: js.Array[java.lang.String] = null,
    userEmail: java.lang.String = null
  ): Anon_LoginStyle = {
    val __obj = js.Dynamic.literal()
    if (loginStyle != null) __obj.updateDynamic("loginStyle")(loginStyle)
    if (loginUrlParameters != null) __obj.updateDynamic("loginUrlParameters")(loginUrlParameters)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (!js.isUndefined(requestOfflineToken)) __obj.updateDynamic("requestOfflineToken")(requestOfflineToken)
    if (requestPermissions != null) __obj.updateDynamic("requestPermissions")(requestPermissions)
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail)
    __obj.asInstanceOf[Anon_LoginStyle]
  }
}

