package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participant extends Person {
  var additional_info: js.UndefOr[String] = js.native
  @JSName("email")
  var email_Participant: String = js.native
  var fax: js.UndefOr[Phone] = js.native
}

object Participant {
  @scala.inline
  def apply(email: String): Participant = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditional_info(value: String): Self = this.set("additional_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional_info: Self = this.set("additional_info", js.undefined)
    @scala.inline
    def setFax(value: Phone): Self = this.set("fax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFax: Self = this.set("fax", js.undefined)
  }
  
}

