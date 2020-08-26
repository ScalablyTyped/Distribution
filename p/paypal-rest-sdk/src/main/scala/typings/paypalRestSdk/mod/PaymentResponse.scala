package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Paymentmethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentResponse
  extends Payment_
     with Response {
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.native
}

object PaymentResponse {
  @scala.inline
  def apply(httpStatusCode: Double, intent: String, payer: Paymentmethod, transactions: js.Array[Transaction]): PaymentResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponse]
  }
  @scala.inline
  implicit class PaymentResponseOps[Self <: PaymentResponse] (val x: Self) extends AnyVal {
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
    def setCreate_time(value: String): Self = this.set("create_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate_time: Self = this.set("create_time", js.undefined)
  }
  
}

