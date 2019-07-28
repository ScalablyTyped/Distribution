package typings.meteor

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
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount, from = from, resetPassword = resetPassword, siteName = siteName, verifyEmail = verifyEmail)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[EmailTemplates]
  }
}

