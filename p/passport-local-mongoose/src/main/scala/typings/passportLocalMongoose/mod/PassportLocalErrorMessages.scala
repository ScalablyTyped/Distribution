package typings.passportLocalMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportLocalErrorMessages extends js.Object {
  var AttemptTooSoonError: js.UndefOr[String] = js.native
  var IncorrectPasswordError: js.UndefOr[String] = js.native
  var IncorrectUsernameError: js.UndefOr[String] = js.native
  var MissingPasswordError: js.UndefOr[String] = js.native
  var MissingUsernameError: js.UndefOr[String] = js.native
  var NoSaltValueStoredError: js.UndefOr[String] = js.native
  var TooManyAttemptsError: js.UndefOr[String] = js.native
  var UserExistsError: js.UndefOr[String] = js.native
}

object PassportLocalErrorMessages {
  @scala.inline
  def apply(): PassportLocalErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PassportLocalErrorMessages]
  }
  @scala.inline
  implicit class PassportLocalErrorMessagesOps[Self <: PassportLocalErrorMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttemptTooSoonError(value: String): Self = this.set("AttemptTooSoonError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttemptTooSoonError: Self = this.set("AttemptTooSoonError", js.undefined)
    @scala.inline
    def setIncorrectPasswordError(value: String): Self = this.set("IncorrectPasswordError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncorrectPasswordError: Self = this.set("IncorrectPasswordError", js.undefined)
    @scala.inline
    def setIncorrectUsernameError(value: String): Self = this.set("IncorrectUsernameError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncorrectUsernameError: Self = this.set("IncorrectUsernameError", js.undefined)
    @scala.inline
    def setMissingPasswordError(value: String): Self = this.set("MissingPasswordError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingPasswordError: Self = this.set("MissingPasswordError", js.undefined)
    @scala.inline
    def setMissingUsernameError(value: String): Self = this.set("MissingUsernameError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingUsernameError: Self = this.set("MissingUsernameError", js.undefined)
    @scala.inline
    def setNoSaltValueStoredError(value: String): Self = this.set("NoSaltValueStoredError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSaltValueStoredError: Self = this.set("NoSaltValueStoredError", js.undefined)
    @scala.inline
    def setTooManyAttemptsError(value: String): Self = this.set("TooManyAttemptsError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooManyAttemptsError: Self = this.set("TooManyAttemptsError", js.undefined)
    @scala.inline
    def setUserExistsError(value: String): Self = this.set("UserExistsError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserExistsError: Self = this.set("UserExistsError", js.undefined)
  }
  
}

