package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailAddress extends js.Object {
  var EmailAddress: String = js.native
}

object EmailAddress {
  @scala.inline
  def apply(EmailAddress: String): EmailAddress = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailAddress]
  }
  @scala.inline
  implicit class EmailAddressOps[Self <: EmailAddress] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
  }
  
}

