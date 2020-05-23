package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmbiguousErrorMessages extends js.Object {
  var ambiguousErrorMessages: js.UndefOr[Boolean] = js.undefined
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined
  var loginExpirationInDays: js.UndefOr[Double] = js.undefined
  var oauthSecretKey: js.UndefOr[String] = js.undefined
  var passwordEnrollTokenExpirationInDays: js.UndefOr[Double] = js.undefined
  var passwordResetTokenExpirationInDays: js.UndefOr[Double] = js.undefined
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.undefined
  var sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
}

object AmbiguousErrorMessages {
  @scala.inline
  def apply(
    ambiguousErrorMessages: js.UndefOr[Boolean] = js.undefined,
    forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined,
    loginExpirationInDays: js.UndefOr[Double] = js.undefined,
    oauthSecretKey: String = null,
    passwordEnrollTokenExpirationInDays: js.UndefOr[Double] = js.undefined,
    passwordResetTokenExpirationInDays: js.UndefOr[Double] = js.undefined,
    restrictCreationByEmailDomain: String | js.Function = null,
    sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
  ): AmbiguousErrorMessages = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ambiguousErrorMessages)) __obj.updateDynamic("ambiguousErrorMessages")(ambiguousErrorMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidClientAccountCreation)) __obj.updateDynamic("forbidClientAccountCreation")(forbidClientAccountCreation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loginExpirationInDays)) __obj.updateDynamic("loginExpirationInDays")(loginExpirationInDays.get.asInstanceOf[js.Any])
    if (oauthSecretKey != null) __obj.updateDynamic("oauthSecretKey")(oauthSecretKey.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordEnrollTokenExpirationInDays)) __obj.updateDynamic("passwordEnrollTokenExpirationInDays")(passwordEnrollTokenExpirationInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordResetTokenExpirationInDays)) __obj.updateDynamic("passwordResetTokenExpirationInDays")(passwordResetTokenExpirationInDays.get.asInstanceOf[js.Any])
    if (restrictCreationByEmailDomain != null) __obj.updateDynamic("restrictCreationByEmailDomain")(restrictCreationByEmailDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(sendVerificationEmail)) __obj.updateDynamic("sendVerificationEmail")(sendVerificationEmail.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbiguousErrorMessages]
  }
}

