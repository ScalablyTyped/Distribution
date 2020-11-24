package typings.paypalRestSdk.mod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "invoice.deleteExternalRefund")
@js.native
object deleteExternalRefund extends js.Object {
  
  def apply(id: String, trxid: String, config: RequestOptions): Unit = js.native
  def apply(id: String, trxid: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, trxid: String, config: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, trxid: String, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
}
