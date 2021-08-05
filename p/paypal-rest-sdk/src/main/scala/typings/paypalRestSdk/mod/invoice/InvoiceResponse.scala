package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvoiceResponse
  extends StObject
     with Invoice
     with Response
object InvoiceResponse {
  
  inline def apply(httpStatusCode: Double): InvoiceResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceResponse]
  }
}
