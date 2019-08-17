package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.authorizationNs.CaptureRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "authorization")
@js.native
object authorizationNs extends js.Object {
  trait CaptureRequest extends js.Object {
    var amount: js.UndefOr[Amount] = js.undefined
    var invoice_number: js.UndefOr[String] = js.undefined
    var is_final_capture: js.UndefOr[Boolean] = js.undefined
  }
  
  def capture(id: String, data: RequestOptions): Unit = js.native
  def capture(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def capture(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = js.native
  def capture(id: String, data: RequestOptions, config: CallbackFunction[CaptureResource]): Unit = js.native
  def capture(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def capture(id: String, data: CallbackFunction[CaptureResource]): Unit = js.native
  def capture(id: String, data: CallbackFunction[CaptureResource], config: RequestOptions): Unit = js.native
  def capture(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: RequestOptions,
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def capture(id: String, data: CallbackFunction[CaptureResource], config: CallbackFunction[CaptureResource]): Unit = js.native
  def capture(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def capture(id: String, data: CaptureRequest): Unit = js.native
  def capture(id: String, data: CaptureRequest, config: RequestOptions): Unit = js.native
  def capture(id: String, data: CaptureRequest, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = js.native
  def capture(id: String, data: CaptureRequest, config: CallbackFunction[CaptureResource]): Unit = js.native
  def capture(
    id: String,
    data: CaptureRequest,
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def get(id: String, config: RequestOptions): Unit = js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[AuthorizationResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[AuthorizationResource]): Unit = js.native
  def get(
    id: String,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def reauthorize(id: String, data: RequestOptions): Unit = js.native
  def reauthorize(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def reauthorize(
    id: String,
    data: RequestOptions,
    config: RequestOptions,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def reauthorize(id: String, data: RequestOptions, config: CallbackFunction[AuthorizationResource]): Unit = js.native
  def reauthorize(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def reauthorize(id: String, data: Amount): Unit = js.native
  def reauthorize(id: String, data: Amount, config: RequestOptions): Unit = js.native
  def reauthorize(id: String, data: Amount, config: RequestOptions, cb: CallbackFunction[AuthorizationResource]): Unit = js.native
  def reauthorize(id: String, data: Amount, config: CallbackFunction[AuthorizationResource]): Unit = js.native
  def reauthorize(
    id: String,
    data: Amount,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def reauthorize(id: String, data: CallbackFunction[AuthorizationResource]): Unit = js.native
  def reauthorize(id: String, data: CallbackFunction[AuthorizationResource], config: RequestOptions): Unit = js.native
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: RequestOptions,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def reauthorize(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
}

