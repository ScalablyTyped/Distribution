package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmbiguousErrorMessages extends js.Object {
  var ambiguousErrorMessages: js.UndefOr[scala.Boolean] = js.undefined
  var forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.undefined
  var loginExpirationInDays: js.UndefOr[scala.Double] = js.undefined
  var oauthSecretKey: js.UndefOr[java.lang.String] = js.undefined
  var passwordEnrollTokenExpirationInDays: js.UndefOr[scala.Double] = js.undefined
  var passwordResetTokenExpirationInDays: js.UndefOr[scala.Double] = js.undefined
  var restrictCreationByEmailDomain: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var sendVerificationEmail: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AmbiguousErrorMessages {
  @scala.inline
  def apply(
    ambiguousErrorMessages: js.UndefOr[scala.Boolean] = js.undefined,
    forbidClientAccountCreation: js.UndefOr[scala.Boolean] = js.undefined,
    loginExpirationInDays: scala.Int | scala.Double = null,
    oauthSecretKey: java.lang.String = null,
    passwordEnrollTokenExpirationInDays: scala.Int | scala.Double = null,
    passwordResetTokenExpirationInDays: scala.Int | scala.Double = null,
    restrictCreationByEmailDomain: java.lang.String | js.Function = null,
    sendVerificationEmail: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AmbiguousErrorMessages = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ambiguousErrorMessages)) __obj.updateDynamic("ambiguousErrorMessages")(ambiguousErrorMessages)
    if (!js.isUndefined(forbidClientAccountCreation)) __obj.updateDynamic("forbidClientAccountCreation")(forbidClientAccountCreation)
    if (loginExpirationInDays != null) __obj.updateDynamic("loginExpirationInDays")(loginExpirationInDays.asInstanceOf[js.Any])
    if (oauthSecretKey != null) __obj.updateDynamic("oauthSecretKey")(oauthSecretKey)
    if (passwordEnrollTokenExpirationInDays != null) __obj.updateDynamic("passwordEnrollTokenExpirationInDays")(passwordEnrollTokenExpirationInDays.asInstanceOf[js.Any])
    if (passwordResetTokenExpirationInDays != null) __obj.updateDynamic("passwordResetTokenExpirationInDays")(passwordResetTokenExpirationInDays.asInstanceOf[js.Any])
    if (restrictCreationByEmailDomain != null) __obj.updateDynamic("restrictCreationByEmailDomain")(restrictCreationByEmailDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(sendVerificationEmail)) __obj.updateDynamic("sendVerificationEmail")(sendVerificationEmail)
    __obj.asInstanceOf[Anon_AmbiguousErrorMessages]
  }
}

