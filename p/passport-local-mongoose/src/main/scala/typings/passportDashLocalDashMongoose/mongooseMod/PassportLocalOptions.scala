package typings.passportDashLocalDashMongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportLocalOptions extends js.Object {
  var attemptsField: js.UndefOr[String] = js.undefined
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var errorMessages: js.UndefOr[PassportLocalErrorMessages] = js.undefined
  var hashField: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var keylen: js.UndefOr[Double] = js.undefined
  var lastLoginField: js.UndefOr[String] = js.undefined
  var limitAttempts: js.UndefOr[Boolean] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var maxInterval: js.UndefOr[Double] = js.undefined
  var passwordValidator: js.UndefOr[
    js.Function2[/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.undefined
  var populateFields: js.UndefOr[String] = js.undefined
  var saltField: js.UndefOr[String] = js.undefined
  var saltlen: js.UndefOr[Double] = js.undefined
  var selectFields: js.UndefOr[String] = js.undefined
  var usernameField: js.UndefOr[String] = js.undefined
  var usernameLowerCase: js.UndefOr[Boolean] = js.undefined
  var usernameQueryFields: js.Array[String]
  var usernameUnique: js.UndefOr[Boolean] = js.undefined
}

object PassportLocalOptions {
  @scala.inline
  def apply(
    usernameQueryFields: js.Array[String],
    attemptsField: String = null,
    digestAlgorithm: String = null,
    encoding: String = null,
    errorMessages: PassportLocalErrorMessages = null,
    hashField: String = null,
    interval: Int | Double = null,
    iterations: Int | Double = null,
    keylen: Int | Double = null,
    lastLoginField: String = null,
    limitAttempts: js.UndefOr[Boolean] = js.undefined,
    maxAttempts: Int | Double = null,
    maxInterval: Int | Double = null,
    passwordValidator: (/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit]) => Unit = null,
    populateFields: String = null,
    saltField: String = null,
    saltlen: Int | Double = null,
    selectFields: String = null,
    usernameField: String = null,
    usernameLowerCase: js.UndefOr[Boolean] = js.undefined,
    usernameUnique: js.UndefOr[Boolean] = js.undefined
  ): PassportLocalOptions = {
    val __obj = js.Dynamic.literal(usernameQueryFields = usernameQueryFields)
    if (attemptsField != null) __obj.updateDynamic("attemptsField")(attemptsField)
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages)
    if (hashField != null) __obj.updateDynamic("hashField")(hashField)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (keylen != null) __obj.updateDynamic("keylen")(keylen.asInstanceOf[js.Any])
    if (lastLoginField != null) __obj.updateDynamic("lastLoginField")(lastLoginField)
    if (!js.isUndefined(limitAttempts)) __obj.updateDynamic("limitAttempts")(limitAttempts)
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxInterval != null) __obj.updateDynamic("maxInterval")(maxInterval.asInstanceOf[js.Any])
    if (passwordValidator != null) __obj.updateDynamic("passwordValidator")(js.Any.fromFunction2(passwordValidator))
    if (populateFields != null) __obj.updateDynamic("populateFields")(populateFields)
    if (saltField != null) __obj.updateDynamic("saltField")(saltField)
    if (saltlen != null) __obj.updateDynamic("saltlen")(saltlen.asInstanceOf[js.Any])
    if (selectFields != null) __obj.updateDynamic("selectFields")(selectFields)
    if (usernameField != null) __obj.updateDynamic("usernameField")(usernameField)
    if (!js.isUndefined(usernameLowerCase)) __obj.updateDynamic("usernameLowerCase")(usernameLowerCase)
    if (!js.isUndefined(usernameUnique)) __obj.updateDynamic("usernameUnique")(usernameUnique)
    __obj.asInstanceOf[PassportLocalOptions]
  }
}

