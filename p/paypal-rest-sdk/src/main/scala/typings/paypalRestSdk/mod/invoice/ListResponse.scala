package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResponse extends Response {
  
  var invoices: js.Array[Invoice] = js.native
}
object ListResponse {
  
  @scala.inline
  def apply(httpStatusCode: Double, invoices: js.Array[Invoice]): ListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], invoices = invoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
  
  @scala.inline
  implicit class ListResponseMutableBuilder[Self <: ListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value :_*))
  }
}
