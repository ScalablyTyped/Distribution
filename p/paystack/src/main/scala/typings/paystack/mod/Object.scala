package typings.paystack.mod

import typings.paystack.anon.Charge
import typings.paystack.anon.Create
import typings.paystack.anon.Disable
import typings.paystack.anon.Get
import typings.paystack.anon.List
import typings.paystack.anon.Listbanks
import typings.paystack.anon.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  var customer: Create = js.native
  var misc: Listbanks = js.native
  var page: Get = js.native
  var plan: List = js.native
  var subaccount: Update = js.native
  var subscription: Disable = js.native
  var transaction: Charge = js.native
}

object Object {
  @scala.inline
  def apply(
    customer: Create,
    misc: Listbanks,
    page: Get,
    plan: List,
    subaccount: Update,
    subscription: Disable,
    transaction: Charge
  ): Object = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subaccount = subaccount.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
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
    def setCustomer(value: Create): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMisc(value: Listbanks): Self = this.set("misc", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Get): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: List): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubaccount(value: Update): Self = this.set("subaccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: Disable): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransaction(value: Charge): Self = this.set("transaction", value.asInstanceOf[js.Any])
  }
  
}

