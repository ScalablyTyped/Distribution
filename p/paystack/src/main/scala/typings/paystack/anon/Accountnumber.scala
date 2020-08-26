package typings.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accountnumber extends js.Object {
  var account_number: String = js.native
  var business_name: String = js.native
  var percentage_charge: Double = js.native
  var settlement_bank: String = js.native
}

object Accountnumber {
  @scala.inline
  def apply(account_number: String, business_name: String, percentage_charge: Double, settlement_bank: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], percentage_charge = percentage_charge.asInstanceOf[js.Any], settlement_bank = settlement_bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
  @scala.inline
  implicit class AccountnumberOps[Self <: Accountnumber] (val x: Self) extends AnyVal {
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
    def setAccount_number(value: String): Self = this.set("account_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusiness_name(value: String): Self = this.set("business_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentage_charge(value: Double): Self = this.set("percentage_charge", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettlement_bank(value: String): Self = this.set("settlement_bank", value.asInstanceOf[js.Any])
  }
  
}

