package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTenancyUnitsResponse extends StObject {
  
  /** Pagination token for large results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Tenancy Units matching the request. */
  var tenancyUnits: js.UndefOr[js.Array[TenancyUnit]] = js.undefined
}
object SearchTenancyUnitsResponse {
  
  inline def apply(): SearchTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTenancyUnitsResponse]
  }
  
  extension [Self <: SearchTenancyUnitsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenancyUnits(value: js.Array[TenancyUnit]): Self = StObject.set(x, "tenancyUnits", value.asInstanceOf[js.Any])
    
    inline def setTenancyUnitsUndefined: Self = StObject.set(x, "tenancyUnits", js.undefined)
    
    inline def setTenancyUnitsVarargs(value: TenancyUnit*): Self = StObject.set(x, "tenancyUnits", js.Array(value*))
  }
}
