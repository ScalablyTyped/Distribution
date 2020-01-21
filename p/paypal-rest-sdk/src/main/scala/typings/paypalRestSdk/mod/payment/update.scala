package typings.paypalRestSdk.mod.payment

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import typings.paypalRestSdk.mod.PaymentResponse
import typings.paypalRestSdk.mod.UpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.update")
@js.native
object update extends js.Object {
  def apply(id: String, data: js.Array[UpdateRequest]): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: RequestOptions,
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
}

