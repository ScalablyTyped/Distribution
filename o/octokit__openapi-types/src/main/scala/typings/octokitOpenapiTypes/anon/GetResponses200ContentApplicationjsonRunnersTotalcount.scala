package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRunnersTotalcount extends StObject {
  
  /**
    * Lists the self-hosted runners that are in a specific enterprise group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonRunnersTotalcount
  
  /**
    * Replaces the list of self-hosted runners that are part of an enterprise runner group.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray
}
object GetResponses200ContentApplicationjsonRunnersTotalcount {
  
  inline def apply(
    get: Responses200ContentApplicationjsonRunnersTotalcount,
    put: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray
  ): GetResponses200ContentApplicationjsonRunnersTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRunnersTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonRunnersTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonRunnersTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathEnterpriseRunnergroupidRequestBodyContentApplicationjsonRunnersArray): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
