package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListForUserEndpoint
import typings.octokitTypes.endpointsMod.GistsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsListForUserEndpoint extends StObject {
  
  var parameters: GistsListForUserEndpoint
  
  var response: OctokitResponse[GistsListForUserResponseData]
}
object ParametersGistsListForUserEndpoint {
  
  inline def apply(parameters: GistsListForUserEndpoint, response: OctokitResponse[GistsListForUserResponseData]): ParametersGistsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForUserEndpoint]
  }
  
  extension [Self <: ParametersGistsListForUserEndpoint](x: Self) {
    
    inline def setParameters(value: GistsListForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
