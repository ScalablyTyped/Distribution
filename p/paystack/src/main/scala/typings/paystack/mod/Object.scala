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

trait Object extends js.Object {
  var customer: Create
  var misc: Listbanks
  var page: Get
  var plan: List
  var subaccount: Update
  var subscription: Disable
  var transaction: Charge
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
}

