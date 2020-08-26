package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvoiceResponse
  extends Invoice
     with Response

object InvoiceResponse {
  @scala.inline
  def apply(httpStatusCode: Double): InvoiceResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceResponse]
  }
}

