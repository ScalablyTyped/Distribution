package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkloadIdentityPoolProvidersResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of providers. */
  var workloadIdentityPoolProviders: js.UndefOr[js.Array[WorkloadIdentityPoolProvider]] = js.undefined
}
object ListWorkloadIdentityPoolProvidersResponse {
  
  inline def apply(): ListWorkloadIdentityPoolProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkloadIdentityPoolProvidersResponse]
  }
  
  extension [Self <: ListWorkloadIdentityPoolProvidersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkloadIdentityPoolProviders(value: js.Array[WorkloadIdentityPoolProvider]): Self = StObject.set(x, "workloadIdentityPoolProviders", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolProvidersUndefined: Self = StObject.set(x, "workloadIdentityPoolProviders", js.undefined)
    
    inline def setWorkloadIdentityPoolProvidersVarargs(value: WorkloadIdentityPoolProvider*): Self = StObject.set(x, "workloadIdentityPoolProviders", js.Array(value*))
  }
}
