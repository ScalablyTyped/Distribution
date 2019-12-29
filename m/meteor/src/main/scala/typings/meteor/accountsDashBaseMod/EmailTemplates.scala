package typings.meteor.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  var enrollAccount: EmailFields
  var from: String
  var headers: js.UndefOr[Header] = js.undefined
  var resetPassword: EmailFields
  var siteName: String
  var verifyEmail: EmailFields
}

object EmailTemplates {
  @scala.inline
  def apply(
    enrollAccount: EmailFields,
    from: String,
    resetPassword: EmailFields,
    siteName: String,
    verifyEmail: EmailFields,
    headers: Header = null
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplates]
  }
}

