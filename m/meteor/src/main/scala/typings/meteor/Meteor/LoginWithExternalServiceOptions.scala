package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
trait LoginWithExternalServiceOptions extends js.Object {
  var forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined
  var loginHint: js.UndefOr[String] = js.undefined
  var loginStyle: js.UndefOr[String] = js.undefined
  var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
  var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
}

object LoginWithExternalServiceOptions {
  @scala.inline
  def apply(
    forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined,
    loginHint: String = null,
    loginStyle: String = null,
    loginUrlParameters: js.Object = null,
    redirectUrl: String = null,
    requestOfflineToken: js.UndefOr[Boolean] = js.undefined,
    requestPermissions: js.Array[String] = null
  ): LoginWithExternalServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceApprovalPrompt)) __obj.updateDynamic("forceApprovalPrompt")(forceApprovalPrompt.get.asInstanceOf[js.Any])
    if (loginHint != null) __obj.updateDynamic("loginHint")(loginHint.asInstanceOf[js.Any])
    if (loginStyle != null) __obj.updateDynamic("loginStyle")(loginStyle.asInstanceOf[js.Any])
    if (loginUrlParameters != null) __obj.updateDynamic("loginUrlParameters")(loginUrlParameters.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(requestOfflineToken)) __obj.updateDynamic("requestOfflineToken")(requestOfflineToken.get.asInstanceOf[js.Any])
    if (requestPermissions != null) __obj.updateDynamic("requestPermissions")(requestPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithExternalServiceOptions]
  }
}

