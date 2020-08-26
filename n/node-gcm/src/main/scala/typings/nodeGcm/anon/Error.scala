package typings.nodeGcm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var error: js.UndefOr[String] = js.native
  var message_id: js.UndefOr[String] = js.native
  var registration_id: js.UndefOr[String] = js.native
}

object Error {
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMessage_id(value: String): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage_id: Self = this.set("message_id", js.undefined)
    @scala.inline
    def setRegistration_id(value: String): Self = this.set("registration_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistration_id: Self = this.set("registration_id", js.undefined)
  }
  
}

