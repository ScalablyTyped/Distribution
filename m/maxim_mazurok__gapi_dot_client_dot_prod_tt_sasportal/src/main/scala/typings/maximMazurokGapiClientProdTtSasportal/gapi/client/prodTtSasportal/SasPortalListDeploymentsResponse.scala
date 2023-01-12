package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalListDeploymentsResponse extends StObject {
  
  /** The deployments that match the request. */
  var deployments: js.UndefOr[js.Array[SasPortalDeployment]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListDeployments that indicates from where listing should continue. If the field is missing or empty, it means there are no more
    * deployments.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SasPortalListDeploymentsResponse {
  
  inline def apply(): SasPortalListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListDeploymentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalListDeploymentsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeployments(value: js.Array[SasPortalDeployment]): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: SasPortalDeployment*): Self = StObject.set(x, "deployments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
