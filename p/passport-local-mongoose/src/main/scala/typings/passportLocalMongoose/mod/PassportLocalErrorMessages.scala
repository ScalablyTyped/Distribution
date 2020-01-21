package typings.passportLocalMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportLocalErrorMessages extends js.Object {
  var AttemptTooSoonError: js.UndefOr[String] = js.undefined
  var IncorrectPasswordError: js.UndefOr[String] = js.undefined
  var IncorrectUsernameError: js.UndefOr[String] = js.undefined
  var MissingPasswordError: js.UndefOr[String] = js.undefined
  var MissingUsernameError: js.UndefOr[String] = js.undefined
  var NoSaltValueStoredError: js.UndefOr[String] = js.undefined
  var TooManyAttemptsError: js.UndefOr[String] = js.undefined
  var UserExistsError: js.UndefOr[String] = js.undefined
}

object PassportLocalErrorMessages {
  @scala.inline
  def apply(
    AttemptTooSoonError: String = null,
    IncorrectPasswordError: String = null,
    IncorrectUsernameError: String = null,
    MissingPasswordError: String = null,
    MissingUsernameError: String = null,
    NoSaltValueStoredError: String = null,
    TooManyAttemptsError: String = null,
    UserExistsError: String = null
  ): PassportLocalErrorMessages = {
    val __obj = js.Dynamic.literal()
    if (AttemptTooSoonError != null) __obj.updateDynamic("AttemptTooSoonError")(AttemptTooSoonError.asInstanceOf[js.Any])
    if (IncorrectPasswordError != null) __obj.updateDynamic("IncorrectPasswordError")(IncorrectPasswordError.asInstanceOf[js.Any])
    if (IncorrectUsernameError != null) __obj.updateDynamic("IncorrectUsernameError")(IncorrectUsernameError.asInstanceOf[js.Any])
    if (MissingPasswordError != null) __obj.updateDynamic("MissingPasswordError")(MissingPasswordError.asInstanceOf[js.Any])
    if (MissingUsernameError != null) __obj.updateDynamic("MissingUsernameError")(MissingUsernameError.asInstanceOf[js.Any])
    if (NoSaltValueStoredError != null) __obj.updateDynamic("NoSaltValueStoredError")(NoSaltValueStoredError.asInstanceOf[js.Any])
    if (TooManyAttemptsError != null) __obj.updateDynamic("TooManyAttemptsError")(TooManyAttemptsError.asInstanceOf[js.Any])
    if (UserExistsError != null) __obj.updateDynamic("UserExistsError")(UserExistsError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportLocalErrorMessages]
  }
}

