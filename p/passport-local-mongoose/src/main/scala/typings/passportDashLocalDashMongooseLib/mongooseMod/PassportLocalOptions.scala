package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportLocalOptions extends js.Object {
  var attemptsField: js.UndefOr[java.lang.String] = js.undefined
  var digestAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var errorMessages: js.UndefOr[PassportLocalErrorMessages] = js.undefined
  var hashField: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var keylen: js.UndefOr[scala.Double] = js.undefined
  var lastLoginField: js.UndefOr[java.lang.String] = js.undefined
  var limitAttempts: js.UndefOr[scala.Boolean] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
  var maxInterval: js.UndefOr[scala.Double] = js.undefined
  var passwordValidator: js.UndefOr[
    js.Function2[
      /* password */ java.lang.String, 
      /* cb */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var populateFields: js.UndefOr[java.lang.String] = js.undefined
  var saltField: js.UndefOr[java.lang.String] = js.undefined
  var saltlen: js.UndefOr[scala.Double] = js.undefined
  var selectFields: js.UndefOr[java.lang.String] = js.undefined
  var usernameField: js.UndefOr[java.lang.String] = js.undefined
  var usernameLowerCase: js.UndefOr[scala.Boolean] = js.undefined
  var usernameQueryFields: js.Array[java.lang.String]
  var usernameUnique: js.UndefOr[scala.Boolean] = js.undefined
}

object PassportLocalOptions {
  @scala.inline
  def apply(
    usernameQueryFields: js.Array[java.lang.String],
    attemptsField: java.lang.String = null,
    digestAlgorithm: java.lang.String = null,
    encoding: java.lang.String = null,
    errorMessages: PassportLocalErrorMessages = null,
    hashField: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    iterations: scala.Int | scala.Double = null,
    keylen: scala.Int | scala.Double = null,
    lastLoginField: java.lang.String = null,
    limitAttempts: js.UndefOr[scala.Boolean] = js.undefined,
    maxAttempts: scala.Int | scala.Double = null,
    maxInterval: scala.Int | scala.Double = null,
    passwordValidator: js.Function2[
      /* password */ java.lang.String, 
      /* cb */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ] = null,
    populateFields: java.lang.String = null,
    saltField: java.lang.String = null,
    saltlen: scala.Int | scala.Double = null,
    selectFields: java.lang.String = null,
    usernameField: java.lang.String = null,
    usernameLowerCase: js.UndefOr[scala.Boolean] = js.undefined,
    usernameUnique: js.UndefOr[scala.Boolean] = js.undefined
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
    if (passwordValidator != null) __obj.updateDynamic("passwordValidator")(passwordValidator)
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

