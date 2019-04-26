package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var id: java.lang.String
  var mask: java.lang.String
  var name: java.lang.String
  var subtype: java.lang.String
  var `type`: java.lang.String
  var verification_status: VerificationStatus
}

object Account {
  @scala.inline
  def apply(
    id: java.lang.String,
    mask: java.lang.String,
    name: java.lang.String,
    subtype: java.lang.String,
    `type`: java.lang.String,
    verification_status: VerificationStatus
  ): Account = {
    val __obj = js.Dynamic.literal(id = id, mask = mask, name = name, subtype = subtype, verification_status = verification_status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Account]
  }
}

