package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTenancyUnitsResponse extends StObject {
  
  /** Pagination token for large results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Tenancy units matching the request. */
  var tenancyUnits: js.UndefOr[js.Array[TenancyUnit]] = js.undefined
}
object ListTenancyUnitsResponse {
  
  @scala.inline
  def apply(): ListTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTenancyUnitsResponse]
  }
  
  @scala.inline
  implicit class ListTenancyUnitsResponseMutableBuilder[Self <: ListTenancyUnitsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTenancyUnits(value: js.Array[TenancyUnit]): Self = StObject.set(x, "tenancyUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUnitsUndefined: Self = StObject.set(x, "tenancyUnits", js.undefined)
    
    @scala.inline
    def setTenancyUnitsVarargs(value: TenancyUnit*): Self = StObject.set(x, "tenancyUnits", js.Array(value :_*))
  }
}
