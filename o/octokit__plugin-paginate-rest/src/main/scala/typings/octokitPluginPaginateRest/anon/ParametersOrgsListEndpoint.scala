package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListEndpoint
import typings.octokitTypes.endpointsMod.OrgsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListEndpoint extends StObject {
  
  var parameters: OrgsListEndpoint
  
  var response: OctokitResponse[OrgsListResponseData]
}
object ParametersOrgsListEndpoint {
  
  inline def apply(parameters: OrgsListEndpoint, response: OctokitResponse[OrgsListResponseData]): ParametersOrgsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListEndpoint]
  }
  
  extension [Self <: ParametersOrgsListEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
