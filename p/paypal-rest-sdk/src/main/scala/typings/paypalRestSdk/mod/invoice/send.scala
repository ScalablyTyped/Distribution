package typings.paypalRestSdk.mod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.send")
@js.native
object send extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, config: CallbackFunction[ListResponse]): Unit = js.native
  def apply(id: String, config: CallbackFunction[ListResponse], cb: CallbackFunction[Null]): Unit = js.native
}

