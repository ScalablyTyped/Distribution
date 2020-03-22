package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceApprovalPrompt extends js.Object {
  var forceApprovalPrompt: js.UndefOr[js.Object] = js.undefined
  var passwordSignupFields: js.UndefOr[String] = js.undefined
  var requestOfflineToken: js.UndefOr[js.Object] = js.undefined
  var requestPermissions: js.UndefOr[js.Object] = js.undefined
}

object AnonForceApprovalPrompt {
  @scala.inline
  def apply(
    forceApprovalPrompt: js.Object = null,
    passwordSignupFields: String = null,
    requestOfflineToken: js.Object = null,
    requestPermissions: js.Object = null
  ): AnonForceApprovalPrompt = {
    val __obj = js.Dynamic.literal()
    if (forceApprovalPrompt != null) __obj.updateDynamic("forceApprovalPrompt")(forceApprovalPrompt.asInstanceOf[js.Any])
    if (passwordSignupFields != null) __obj.updateDynamic("passwordSignupFields")(passwordSignupFields.asInstanceOf[js.Any])
    if (requestOfflineToken != null) __obj.updateDynamic("requestOfflineToken")(requestOfflineToken.asInstanceOf[js.Any])
    if (requestPermissions != null) __obj.updateDynamic("requestPermissions")(requestPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceApprovalPrompt]
  }
}

