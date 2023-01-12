package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTenantsResponse extends StObject {
  
  /** Additional information for the API invocation, such as the request tracking id. */
  var metadata: js.UndefOr[ResponseMetadata] = js.undefined
  
  /** A token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Tenants for the current client. */
  var tenants: js.UndefOr[js.Array[Tenant]] = js.undefined
}
object ListTenantsResponse {
  
  inline def apply(): ListTenantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTenantsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTenantsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: ResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenants(value: js.Array[Tenant]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    
    inline def setTenantsUndefined: Self = StObject.set(x, "tenants", js.undefined)
    
    inline def setTenantsVarargs(value: Tenant*): Self = StObject.set(x, "tenants", js.Array(value*))
  }
}
