package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var id: String = js.native
  var mask: String = js.native
  var name: String = js.native
  var subtype: String = js.native
  var `type`: String = js.native
  var verification_status: VerificationStatus = js.native
}

object Account {
  @scala.inline
  def apply(
    id: String,
    mask: String,
    name: String,
    subtype: String,
    `type`: String,
    verification_status: VerificationStatus
  ): Account = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], verification_status = verification_status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification_status(value: VerificationStatus): Self = this.set("verification_status", value.asInstanceOf[js.Any])
  }
  
}

