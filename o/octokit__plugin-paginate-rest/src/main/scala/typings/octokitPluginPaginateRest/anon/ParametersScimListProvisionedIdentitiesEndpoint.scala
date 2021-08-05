package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersScimListProvisionedIdentitiesEndpoint extends StObject {
  
  var parameters: ScimListProvisionedIdentitiesEndpoint
  
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] & `16`
}
object ParametersScimListProvisionedIdentitiesEndpoint {
  
  inline def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData] & `16`
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
  
  extension [Self <: ParametersScimListProvisionedIdentitiesEndpoint](x: Self) {
    
    inline def setParameters(value: ScimListProvisionedIdentitiesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ScimListProvisionedIdentitiesResponseData] & `16`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
