package typings.meteor.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  var enrollAccount: typings.meteor.accountsDashBaseMod.EmailFields
  var from: String
  var headers: js.UndefOr[typings.meteor.accountsDashBaseMod.Header] = js.undefined
  var resetPassword: typings.meteor.accountsDashBaseMod.EmailFields
  var siteName: String
  var verifyEmail: typings.meteor.accountsDashBaseMod.EmailFields
}

object EmailTemplates {
  @scala.inline
  def apply(
    enrollAccount: typings.meteor.accountsDashBaseMod.EmailFields,
    from: String,
    resetPassword: typings.meteor.accountsDashBaseMod.EmailFields,
    siteName: String,
    verifyEmail: typings.meteor.accountsDashBaseMod.EmailFields,
    headers: typings.meteor.accountsDashBaseMod.Header = null
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount, from = from, resetPassword = resetPassword, siteName = siteName, verifyEmail = verifyEmail)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[EmailTemplates]
  }
}

