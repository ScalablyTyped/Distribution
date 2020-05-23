package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginStyle extends js.Object {
  var loginStyle: js.UndefOr[String] = js.undefined
  var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
  var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
  var userEmail: js.UndefOr[String] = js.undefined
}

object LoginStyle {
  @scala.inline
  def apply(
    loginStyle: String = null,
    loginUrlParameters: js.Object = null,
    redirectUrl: String = null,
    requestOfflineToken: js.UndefOr[Boolean] = js.undefined,
    requestPermissions: js.Array[String] = null,
    userEmail: String = null
  ): LoginStyle = {
    val __obj = js.Dynamic.literal()
    if (loginStyle != null) __obj.updateDynamic("loginStyle")(loginStyle.asInstanceOf[js.Any])
    if (loginUrlParameters != null) __obj.updateDynamic("loginUrlParameters")(loginUrlParameters.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(requestOfflineToken)) __obj.updateDynamic("requestOfflineToken")(requestOfflineToken.get.asInstanceOf[js.Any])
    if (requestPermissions != null) __obj.updateDynamic("requestPermissions")(requestPermissions.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginStyle]
  }
}

