package typings.plaidDashLink.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var id: String
  var mask: String
  var name: String
  var subtype: String
  var `type`: String
  var verification_status: VerificationStatus
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
    val __obj = js.Dynamic.literal(id = id, mask = mask, name = name, subtype = subtype, verification_status = verification_status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Account]
  }
}

