package typings.paystack.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization extends js.Object {
  var authorization: String = js.native
  var customer: String = js.native
  var plan: String = js.native
  var start_date: js.UndefOr[Date] = js.native
}

object Authorization {
  @scala.inline
  def apply(authorization: String, customer: String, plan: String): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  @scala.inline
  implicit class AuthorizationOps[Self <: Authorization] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_date(value: Date): Self = this.set("start_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_date: Self = this.set("start_date", js.undefined)
  }
  
}

