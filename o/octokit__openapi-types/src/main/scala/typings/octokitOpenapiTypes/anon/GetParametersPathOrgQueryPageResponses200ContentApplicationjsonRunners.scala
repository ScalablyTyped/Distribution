package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners extends StObject {
  
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners
}
object GetParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners {
  
  inline def apply(get: ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners): GetParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners]
  }
  
  extension [Self <: GetParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners](x: Self) {
    
    inline def setGet(value: ParametersPathOrgQueryPageResponses200ContentApplicationjsonRunners): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
