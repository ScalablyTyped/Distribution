package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalListCustomersResponse extends StObject {
  
  /** The list of customers that match the request. */
  var customers: js.UndefOr[js.Array[SasPortalCustomer]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListCustomers that indicates from where listing should continue. If the field is missing or empty, it means there are no more
    * customers.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SasPortalListCustomersResponse {
  
  inline def apply(): SasPortalListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListCustomersResponse]
  }
  
  extension [Self <: SasPortalListCustomersResponse](x: Self) {
    
    inline def setCustomers(value: js.Array[SasPortalCustomer]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: SasPortalCustomer*): Self = StObject.set(x, "customers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
