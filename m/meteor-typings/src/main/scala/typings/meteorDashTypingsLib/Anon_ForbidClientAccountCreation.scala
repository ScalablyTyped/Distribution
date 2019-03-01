package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForbidClientAccountCreation extends js.Object {
  var forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.undefined
  var loginExpirationInDays: js.UndefOr[scala.Double] = js.undefined
  var oauthSecretKey: js.UndefOr[java.lang.String] = js.undefined
  var restrictCreationByEmailDomain: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var sendVerificationEmail: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ForbidClientAccountCreation {
  @scala.inline
  def apply(
    forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.undefined,
    loginExpirationInDays: scala.Int | scala.Double = null,
    oauthSecretKey: java.lang.String = null,
    restrictCreationByEmailDomain: java.lang.String | js.Function = null,
    sendVerificationEmail: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ForbidClientAccountCreation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forbidClientAccountCreation)) __obj.updateDynamic("forbidClientAccountCreation")(forbidClientAccountCreation)
    if (loginExpirationInDays != null) __obj.updateDynamic("loginExpirationInDays")(loginExpirationInDays.asInstanceOf[js.Any])
    if (oauthSecretKey != null) __obj.updateDynamic("oauthSecretKey")(oauthSecretKey)
    if (restrictCreationByEmailDomain != null) __obj.updateDynamic("restrictCreationByEmailDomain")(restrictCreationByEmailDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(sendVerificationEmail)) __obj.updateDynamic("sendVerificationEmail")(sendVerificationEmail)
    __obj.asInstanceOf[Anon_ForbidClientAccountCreation]
  }
}

