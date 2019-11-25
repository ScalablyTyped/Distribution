package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForbidClientAccountCreation extends js.Object {
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined
  var loginExpirationInDays: js.UndefOr[Double] = js.undefined
  var oauthSecretKey: js.UndefOr[String] = js.undefined
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.undefined
  var sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
}

object Anon_ForbidClientAccountCreation {
  @scala.inline
  def apply(
    forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined,
    loginExpirationInDays: Int | Double = null,
    oauthSecretKey: String = null,
    restrictCreationByEmailDomain: String | js.Function = null,
    sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
  ): Anon_ForbidClientAccountCreation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forbidClientAccountCreation)) __obj.updateDynamic("forbidClientAccountCreation")(forbidClientAccountCreation.asInstanceOf[js.Any])
    if (loginExpirationInDays != null) __obj.updateDynamic("loginExpirationInDays")(loginExpirationInDays.asInstanceOf[js.Any])
    if (oauthSecretKey != null) __obj.updateDynamic("oauthSecretKey")(oauthSecretKey.asInstanceOf[js.Any])
    if (restrictCreationByEmailDomain != null) __obj.updateDynamic("restrictCreationByEmailDomain")(restrictCreationByEmailDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(sendVerificationEmail)) __obj.updateDynamic("sendVerificationEmail")(sendVerificationEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForbidClientAccountCreation]
  }
}

