package typings
package passportDashLocalDashMongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportLocalErrorMessages extends js.Object {
  var AttemptTooSoonError: js.UndefOr[java.lang.String] = js.undefined
  var IncorrectPasswordError: js.UndefOr[java.lang.String] = js.undefined
  var IncorrectUsernameError: js.UndefOr[java.lang.String] = js.undefined
  var MissingPasswordError: js.UndefOr[java.lang.String] = js.undefined
  var MissingUsernameError: js.UndefOr[java.lang.String] = js.undefined
  var NoSaltValueStoredError: js.UndefOr[java.lang.String] = js.undefined
  var TooManyAttemptsError: js.UndefOr[java.lang.String] = js.undefined
  var UserExistsError: js.UndefOr[java.lang.String] = js.undefined
}

object PassportLocalErrorMessages {
  @scala.inline
  def apply(
    AttemptTooSoonError: java.lang.String = null,
    IncorrectPasswordError: java.lang.String = null,
    IncorrectUsernameError: java.lang.String = null,
    MissingPasswordError: java.lang.String = null,
    MissingUsernameError: java.lang.String = null,
    NoSaltValueStoredError: java.lang.String = null,
    TooManyAttemptsError: java.lang.String = null,
    UserExistsError: java.lang.String = null
  ): PassportLocalErrorMessages = {
    val __obj = js.Dynamic.literal()
    if (AttemptTooSoonError != null) __obj.updateDynamic("AttemptTooSoonError")(AttemptTooSoonError)
    if (IncorrectPasswordError != null) __obj.updateDynamic("IncorrectPasswordError")(IncorrectPasswordError)
    if (IncorrectUsernameError != null) __obj.updateDynamic("IncorrectUsernameError")(IncorrectUsernameError)
    if (MissingPasswordError != null) __obj.updateDynamic("MissingPasswordError")(MissingPasswordError)
    if (MissingUsernameError != null) __obj.updateDynamic("MissingUsernameError")(MissingUsernameError)
    if (NoSaltValueStoredError != null) __obj.updateDynamic("NoSaltValueStoredError")(NoSaltValueStoredError)
    if (TooManyAttemptsError != null) __obj.updateDynamic("TooManyAttemptsError")(TooManyAttemptsError)
    if (UserExistsError != null) __obj.updateDynamic("UserExistsError")(UserExistsError)
    __obj.asInstanceOf[PassportLocalErrorMessages]
  }
}

