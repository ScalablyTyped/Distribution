package typings.paystack.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends js.Object {
  var authorization: String
  var customer: String
  var plan: String
  var start_date: js.UndefOr[Date] = js.undefined
}

object Authorization {
  @scala.inline
  def apply(authorization: String, customer: String, plan: String, start_date: Date = null): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    if (start_date != null) __obj.updateDynamic("start_date")(start_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

