package typings.paypalRestSdk.mod.payment

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import typings.paypalRestSdk.mod.PaymentResponse
import typings.paypalRestSdk.mod.Payment_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.create")
@js.native
object create extends js.Object {
  def apply(data: Payment_, config: RequestOptions): Unit = js.native
  def apply(data: Payment_, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment_, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment_, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
}

