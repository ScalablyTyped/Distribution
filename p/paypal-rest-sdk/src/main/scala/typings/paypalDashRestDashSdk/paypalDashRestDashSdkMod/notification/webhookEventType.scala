package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.QueryParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification.webhookEventType")
@js.native
object webhookEventType extends js.Object {
  def list(data: RequestOptions): Unit = js.native
  def list(data: RequestOptions, config: RequestOptions): Unit = js.native
  def list(data: RequestOptions, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
  def list(data: RequestOptions, config: CallbackFunction[EventTypesResponse]): Unit = js.native
  def list(
    data: RequestOptions,
    config: CallbackFunction[EventTypesResponse],
    cb: CallbackFunction[EventTypesResponse]
  ): Unit = js.native
  def list(data: CallbackFunction[EventTypesResponse]): Unit = js.native
  def list(data: CallbackFunction[EventTypesResponse], config: RequestOptions): Unit = js.native
  def list(
    data: CallbackFunction[EventTypesResponse],
    config: RequestOptions,
    cb: CallbackFunction[EventTypesResponse]
  ): Unit = js.native
  def list(data: CallbackFunction[EventTypesResponse], config: CallbackFunction[EventTypesResponse]): Unit = js.native
  def list(
    data: CallbackFunction[EventTypesResponse],
    config: CallbackFunction[EventTypesResponse],
    cb: CallbackFunction[EventTypesResponse]
  ): Unit = js.native
  def list(data: QueryParameters): Unit = js.native
  def list(data: QueryParameters, config: RequestOptions): Unit = js.native
  def list(data: QueryParameters, config: RequestOptions, cb: CallbackFunction[EventTypesResponse]): Unit = js.native
  def list(data: QueryParameters, config: CallbackFunction[EventTypesResponse]): Unit = js.native
  def list(
    data: QueryParameters,
    config: CallbackFunction[EventTypesResponse],
    cb: CallbackFunction[EventTypesResponse]
  ): Unit = js.native
}

