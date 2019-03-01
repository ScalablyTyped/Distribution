package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
trait LoginWithExternalServiceOptions extends js.Object {
  var forceApprovalPrompt: js.UndefOr[scala.Boolean] = js.undefined
  var loginHint: js.UndefOr[java.lang.String] = js.undefined
  var loginStyle: js.UndefOr[java.lang.String] = js.undefined
  var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  var requestOfflineToken: js.UndefOr[scala.Boolean] = js.undefined
  var requestPermissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LoginWithExternalServiceOptions {
  @scala.inline
  def apply(
    forceApprovalPrompt: js.UndefOr[scala.Boolean] = js.undefined,
    loginHint: java.lang.String = null,
    loginStyle: java.lang.String = null,
    loginUrlParameters: js.Object = null,
    redirectUrl: java.lang.String = null,
    requestOfflineToken: js.UndefOr[scala.Boolean] = js.undefined,
    requestPermissions: js.Array[java.lang.String] = null
  ): LoginWithExternalServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceApprovalPrompt)) __obj.updateDynamic("forceApprovalPrompt")(forceApprovalPrompt)
    if (loginHint != null) __obj.updateDynamic("loginHint")(loginHint)
    if (loginStyle != null) __obj.updateDynamic("loginStyle")(loginStyle)
    if (loginUrlParameters != null) __obj.updateDynamic("loginUrlParameters")(loginUrlParameters)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (!js.isUndefined(requestOfflineToken)) __obj.updateDynamic("requestOfflineToken")(requestOfflineToken)
    if (requestPermissions != null) __obj.updateDynamic("requestPermissions")(requestPermissions)
    __obj.asInstanceOf[LoginWithExternalServiceOptions]
  }
}

