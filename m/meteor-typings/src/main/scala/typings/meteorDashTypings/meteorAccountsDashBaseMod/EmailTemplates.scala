package typings.meteorDashTypings.meteorAccountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  var enrollAccount: typings.meteorDashTypings.meteorAccountsDashBaseMod.EmailFields
  var from: String
  var headers: js.UndefOr[typings.meteorDashTypings.meteorAccountsDashBaseMod.Header] = js.undefined
  var resetPassword: typings.meteorDashTypings.meteorAccountsDashBaseMod.EmailFields
  var siteName: String
  var verifyEmail: typings.meteorDashTypings.meteorAccountsDashBaseMod.EmailFields
}

object EmailTemplates {
  @scala.inline
  def apply(
    enrollAccount: typings.meteorDashTypings.meteorAccountsDashBaseMod.EmailFields,
    from: String,
    resetPassword: typings.meteorDashTypings.meteorAccountsDashBaseMod.EmailFields,
    siteName: String,
    verifyEmail: typings.meteorDashTypings.meteorAccountsDashBaseMod.EmailFields,
    headers: typings.meteorDashTypings.meteorAccountsDashBaseMod.Header = null
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal(enrollAccount = enrollAccount.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resetPassword = resetPassword.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], verifyEmail = verifyEmail.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplates]
  }
}

