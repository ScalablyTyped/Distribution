package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForceApprovalPrompt extends js.Object {
  var forceApprovalPrompt: js.UndefOr[js.Object] = js.undefined
  var passwordSignupFields: js.UndefOr[java.lang.String] = js.undefined
  var requestOfflineToken: js.UndefOr[js.Object] = js.undefined
  var requestPermissions: js.UndefOr[js.Object] = js.undefined
}

object Anon_ForceApprovalPrompt {
  @scala.inline
  def apply(
    forceApprovalPrompt: js.Object = null,
    passwordSignupFields: java.lang.String = null,
    requestOfflineToken: js.Object = null,
    requestPermissions: js.Object = null
  ): Anon_ForceApprovalPrompt = {
    val __obj = js.Dynamic.literal()
    if (forceApprovalPrompt != null) __obj.updateDynamic("forceApprovalPrompt")(forceApprovalPrompt)
    if (passwordSignupFields != null) __obj.updateDynamic("passwordSignupFields")(passwordSignupFields)
    if (requestOfflineToken != null) __obj.updateDynamic("requestOfflineToken")(requestOfflineToken)
    if (requestPermissions != null) __obj.updateDynamic("requestPermissions")(requestPermissions)
    __obj.asInstanceOf[Anon_ForceApprovalPrompt]
  }
}

