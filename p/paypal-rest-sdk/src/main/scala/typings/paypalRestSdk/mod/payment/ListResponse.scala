package typings.paypalRestSdk.mod.payment

import typings.paypalRestSdk.mod.Payment_
import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResponse extends Response {
  @JSName("count")
  var count_ListResponse: Double = js.native
  var next_id: String = js.native
  var payments: js.Array[Payment_] = js.native
}

object ListResponse {
  @scala.inline
  def apply(count: Double, httpStatusCode: Double, next_id: String, payments: js.Array[Payment_]): ListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], next_id = next_id.asInstanceOf[js.Any], payments = payments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
  @scala.inline
  implicit class ListResponseOps[Self <: ListResponse] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_id(value: String): Self = this.set("next_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentsVarargs(value: Payment_ *): Self = this.set("payments", js.Array(value :_*))
    @scala.inline
    def setPayments(value: js.Array[Payment_]): Self = this.set("payments", value.asInstanceOf[js.Any])
  }
  
}

