package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "capture")
@js.native
object captureNs extends js.Object {
  def get(id: String, config: RequestOptions): Unit = js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[CaptureResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[CaptureResource], cb: CallbackFunction[CaptureResource]): Unit = js.native
  def refund(id: String, data: RequestOptions): Unit = js.native
  def refund(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def refund(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = js.native
  def refund(id: String, data: RequestOptions, config: CallbackFunction[RefundResource]): Unit = js.native
  def refund(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = js.native
  def refund(id: String, data: CallbackFunction[RefundResource]): Unit = js.native
  def refund(id: String, data: CallbackFunction[RefundResource], config: RequestOptions): Unit = js.native
  def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: RequestOptions,
    cb: CallbackFunction[RefundResource]
  ): Unit = js.native
  def refund(id: String, data: CallbackFunction[RefundResource], config: CallbackFunction[RefundResource]): Unit = js.native
  def refund(
    id: String,
    data: CallbackFunction[RefundResource],
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = js.native
  def refund(id: String, data: RefundRequest): Unit = js.native
  def refund(id: String, data: RefundRequest, config: RequestOptions): Unit = js.native
  def refund(id: String, data: RefundRequest, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = js.native
  def refund(id: String, data: RefundRequest, config: CallbackFunction[RefundResource]): Unit = js.native
  def refund(
    id: String,
    data: RefundRequest,
    config: CallbackFunction[RefundResource],
    cb: CallbackFunction[RefundResource]
  ): Unit = js.native
}

