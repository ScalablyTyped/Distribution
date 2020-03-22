package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmbiguousErrorMessages extends js.Object {
  var ambiguousErrorMessages: js.UndefOr[Boolean] = js.undefined
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined
  var loginExpirationInDays: js.UndefOr[Double] = js.undefined
  var oauthSecretKey: js.UndefOr[String] = js.undefined
  var passwordEnrollTokenExpirationInDays: js.UndefOr[Double] = js.undefined
  var passwordResetTokenExpirationInDays: js.UndefOr[Double] = js.undefined
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.undefined
  var sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
}

object AnonAmbiguousErrorMessages {
  @scala.inline
  def apply(
    ambiguousErrorMessages: js.UndefOr[Boolean] = js.undefined,
    forbidClientAccountCreation: js.UndefOr[Boolean] = js.undefined,
    loginExpirationInDays: Int | Double = null,
    oauthSecretKey: String = null,
    passwordEnrollTokenExpirationInDays: Int | Double = null,
    passwordResetTokenExpirationInDays: Int | Double = null,
    restrictCreationByEmailDomain: String | js.Function = null,
    sendVerificationEmail: js.UndefOr[Boolean] = js.undefined
  ): AnonAmbiguousErrorMessages = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ambiguousErrorMessages)) __obj.updateDynamic("ambiguousErrorMessages")(ambiguousErrorMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidClientAccountCreation)) __obj.updateDynamic("forbidClientAccountCreation")(forbidClientAccountCreation.asInstanceOf[js.Any])
    if (loginExpirationInDays != null) __obj.updateDynamic("loginExpirationInDays")(loginExpirationInDays.asInstanceOf[js.Any])
    if (oauthSecretKey != null) __obj.updateDynamic("oauthSecretKey")(oauthSecretKey.asInstanceOf[js.Any])
    if (passwordEnrollTokenExpirationInDays != null) __obj.updateDynamic("passwordEnrollTokenExpirationInDays")(passwordEnrollTokenExpirationInDays.asInstanceOf[js.Any])
    if (passwordResetTokenExpirationInDays != null) __obj.updateDynamic("passwordResetTokenExpirationInDays")(passwordResetTokenExpirationInDays.asInstanceOf[js.Any])
    if (restrictCreationByEmailDomain != null) __obj.updateDynamic("restrictCreationByEmailDomain")(restrictCreationByEmailDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(sendVerificationEmail)) __obj.updateDynamic("sendVerificationEmail")(sendVerificationEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmbiguousErrorMessages]
  }
}

