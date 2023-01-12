package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkloadIdentityPoolsResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of pools. */
  var workloadIdentityPools: js.UndefOr[js.Array[WorkloadIdentityPool]] = js.undefined
}
object ListWorkloadIdentityPoolsResponse {
  
  inline def apply(): ListWorkloadIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkloadIdentityPoolsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkloadIdentityPoolsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWorkloadIdentityPools(value: js.Array[WorkloadIdentityPool]): Self = StObject.set(x, "workloadIdentityPools", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdentityPoolsUndefined: Self = StObject.set(x, "workloadIdentityPools", js.undefined)
    
    inline def setWorkloadIdentityPoolsVarargs(value: WorkloadIdentityPool*): Self = StObject.set(x, "workloadIdentityPools", js.Array(value*))
  }
}
