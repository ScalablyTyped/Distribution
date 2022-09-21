package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvoicesResponse extends StObject {
  
  /** The list of invoices. This list will be absent if empty. */
  var invoices: js.UndefOr[js.Array[Invoice]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInvoices` method to retrieve the next page of results. This
    * token will be absent if there are no more invoices to return.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInvoicesResponse {
  
  inline def apply(): ListInvoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvoicesResponse]
  }
  
  extension [Self <: ListInvoicesResponse](x: Self) {
    
    inline def setInvoices(value: js.Array[Invoice]): Self = StObject.set(x, "invoices", value.asInstanceOf[js.Any])
    
    inline def setInvoicesUndefined: Self = StObject.set(x, "invoices", js.undefined)
    
    inline def setInvoicesVarargs(value: Invoice*): Self = StObject.set(x, "invoices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
