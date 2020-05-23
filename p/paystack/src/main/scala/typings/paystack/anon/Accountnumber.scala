package typings.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accountnumber extends js.Object {
  var account_number: String
  var business_name: String
  var percentage_charge: Double
  var settlement_bank: String
}

object Accountnumber {
  @scala.inline
  def apply(account_number: String, business_name: String, percentage_charge: Double, settlement_bank: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], percentage_charge = percentage_charge.asInstanceOf[js.Any], settlement_bank = settlement_bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
}

