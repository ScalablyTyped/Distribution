package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
