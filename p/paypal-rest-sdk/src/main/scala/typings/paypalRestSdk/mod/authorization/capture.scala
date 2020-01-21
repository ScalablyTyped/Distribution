package typings.paypalRestSdk.mod.authorization

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import typings.paypalRestSdk.mod.CaptureResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "authorization.capture")
@js.native
object capture extends js.Object {
  def apply(id: String, data: RequestOptions): Unit = js.native
  def apply(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def apply(id: String, data: RequestOptions, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = js.native
  def apply(id: String, data: RequestOptions, config: CallbackFunction[CaptureResource]): Unit = js.native
  def apply(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def apply(id: String, data: CallbackFunction[CaptureResource]): Unit = js.native
  def apply(id: String, data: CallbackFunction[CaptureResource], config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: RequestOptions,
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def apply(id: String, data: CallbackFunction[CaptureResource], config: CallbackFunction[CaptureResource]): Unit = js.native
  def apply(
    id: String,
    data: CallbackFunction[CaptureResource],
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
  def apply(id: String, data: CaptureRequest): Unit = js.native
  def apply(id: String, data: CaptureRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: CaptureRequest, config: RequestOptions, cb: CallbackFunction[CaptureResource]): Unit = js.native
  def apply(id: String, data: CaptureRequest, config: CallbackFunction[CaptureResource]): Unit = js.native
  def apply(
    id: String,
    data: CaptureRequest,
    config: CallbackFunction[CaptureResource],
    cb: CallbackFunction[CaptureResource]
  ): Unit = js.native
}

