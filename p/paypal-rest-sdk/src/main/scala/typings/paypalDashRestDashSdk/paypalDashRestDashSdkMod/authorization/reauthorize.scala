package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.authorization

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Amount
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.AuthorizationResource
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "authorization.reauthorize")
@js.native
object reauthorize extends js.Object {
  def apply(id: String, data: RequestOptions): Unit = js.native
  def apply(id: String, data: RequestOptions, config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    data: RequestOptions,
    config: RequestOptions,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def apply(id: String, data: RequestOptions, config: CallbackFunction[AuthorizationResource]): Unit = js.native
  def apply(
    id: String,
    data: RequestOptions,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def apply(id: String, data: Amount): Unit = js.native
  def apply(id: String, data: Amount, config: RequestOptions): Unit = js.native
  def apply(id: String, data: Amount, config: RequestOptions, cb: CallbackFunction[AuthorizationResource]): Unit = js.native
  def apply(id: String, data: Amount, config: CallbackFunction[AuthorizationResource]): Unit = js.native
  def apply(
    id: String,
    data: Amount,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def apply(id: String, data: CallbackFunction[AuthorizationResource]): Unit = js.native
  def apply(id: String, data: CallbackFunction[AuthorizationResource], config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: RequestOptions,
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def apply(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
  def apply(
    id: String,
    data: CallbackFunction[AuthorizationResource],
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
}

