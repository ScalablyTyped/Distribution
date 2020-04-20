package typings.paystack.mod

import typings.paystack.AnonCharge
import typings.paystack.AnonCreate
import typings.paystack.AnonDisable
import typings.paystack.AnonGet
import typings.paystack.AnonList
import typings.paystack.AnonListbanks
import typings.paystack.AnonUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var customer: AnonCreate
  var misc: AnonListbanks
  var page: AnonGet
  var plan: AnonList
  var subaccount: AnonUpdate
  var subscription: AnonDisable
  var transaction: AnonCharge
}

object Object {
  @scala.inline
  def apply(
    customer: AnonCreate,
    misc: AnonListbanks,
    page: AnonGet,
    plan: AnonList,
    subaccount: AnonUpdate,
    subscription: AnonDisable,
    transaction: AnonCharge
  ): Object = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], subaccount = subaccount.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object]
  }
}

