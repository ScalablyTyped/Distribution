package typings.paypalRestSdk.mod.payment

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import typings.paypalRestSdk.mod.PaymentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.execute")
@js.native
object execute extends js.Object {
  def apply(id: String, data: ExecuteRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: ExecuteRequest, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(id: String, data: ExecuteRequest, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(
    id: String,
    data: ExecuteRequest,
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
}

