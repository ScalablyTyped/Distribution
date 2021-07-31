package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalListCustomersResponse extends StObject {
  
  /** The list of customers that match the request. */
  var customers: js.UndefOr[js.Array[SasPortalCustomer]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListCustomers method that indicates from where listing should continue. If the field is missing or empty, it means there are no
    * more customers.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SasPortalListCustomersResponse {
  
  @scala.inline
  def apply(): SasPortalListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListCustomersResponse]
  }
  
  @scala.inline
  implicit class SasPortalListCustomersResponseMutableBuilder[Self <: SasPortalListCustomersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomers(value: js.Array[SasPortalCustomer]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    @scala.inline
    def setCustomersVarargs(value: SasPortalCustomer*): Self = StObject.set(x, "customers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
