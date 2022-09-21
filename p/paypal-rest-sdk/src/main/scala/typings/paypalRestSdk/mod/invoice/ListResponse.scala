package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResponse
  extends StObject
     with Response {
  
  var invoices: js.Array[Invoice]
}
object ListResponse {
  
  inline def apply(httpStatusCode: Double, invoices: js.Array[Invoice]): ListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
  
  extension [Self <: ListResponse](x: Self) {
    
    inline def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value*))
  }
}
