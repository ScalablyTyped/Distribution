package typings.paypalRestSdk.mod.invoice

import typings.node.httpMod.RequestOptions
import typings.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("paypal-rest-sdk", "invoice.update")
@js.native
object update extends js.Object {
  
  def apply(id: String, data: Invoice, config: RequestOptions): Unit = js.native
  def apply(id: String, data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(id: String, data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(
    id: String,
    data: Invoice,
    config: CallbackFunction[InvoiceResponse],
    cb: CallbackFunction[InvoiceResponse]
  ): Unit = js.native
}
