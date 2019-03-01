package typings
package meteorLib.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplates extends js.Object {
  var enrollAccount: EmailFields
  var from: java.lang.String
  var headers: js.UndefOr[Header] = js.undefined
  var resetPassword: EmailFields
  var siteName: java.lang.String
  var verifyEmail: EmailFields
}

object EmailTemplates {
  @scala.inline
  def apply(
    enrollAccount: EmailFields,
    from: java.lang.String,
    resetPassword: EmailFields,
    siteName: java.lang.String,
    verifyEmail: EmailFields,
    headers: Header = null
  ): EmailTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enrollAccount")(enrollAccount)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("resetPassword")(resetPassword)
    __obj.updateDynamic("siteName")(siteName)
    __obj.updateDynamic("verifyEmail")(verifyEmail)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[EmailTemplates]
  }
}

