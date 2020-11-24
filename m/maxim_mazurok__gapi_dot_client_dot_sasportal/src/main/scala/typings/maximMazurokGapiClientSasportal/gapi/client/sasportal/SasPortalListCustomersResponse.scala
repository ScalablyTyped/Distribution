package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalListCustomersResponse extends js.Object {
  
  /** The list of customers that match the request. */
  var customers: js.UndefOr[js.Array[SasPortalCustomer]] = js.native
  
  /**
    * A pagination token returned from a previous call to ListCustomers method that indicates from where listing should continue. If the field is missing or empty, it means there are no
    * more customers.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SasPortalListCustomersResponse {
  
  @scala.inline
  def apply(): SasPortalListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListCustomersResponse]
  }
  
  @scala.inline
  implicit class SasPortalListCustomersResponseOps[Self <: SasPortalListCustomersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomersVarargs(value: SasPortalCustomer*): Self = this.set("customers", js.Array(value :_*))
    
    @scala.inline
    def setCustomers(value: js.Array[SasPortalCustomer]): Self = this.set("customers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomers: Self = this.set("customers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
