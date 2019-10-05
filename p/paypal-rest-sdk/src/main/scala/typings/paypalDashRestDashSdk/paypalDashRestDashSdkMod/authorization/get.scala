package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.authorization

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.AuthorizationResource
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "authorization.get")
@js.native
object get extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[AuthorizationResource]): Unit = js.native
  def apply(id: String, config: CallbackFunction[AuthorizationResource]): Unit = js.native
  def apply(
    id: String,
    config: CallbackFunction[AuthorizationResource],
    cb: CallbackFunction[AuthorizationResource]
  ): Unit = js.native
}

