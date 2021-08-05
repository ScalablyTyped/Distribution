package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListStarredEndpoint
import typings.octokitTypes.endpointsMod.GistsListStarredResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsListStarredEndpoint extends StObject {
  
  var parameters: GistsListStarredEndpoint
  
  var response: OctokitResponse[GistsListStarredResponseData]
}
object ParametersGistsListStarredEndpoint {
  
  inline def apply(parameters: GistsListStarredEndpoint, response: OctokitResponse[GistsListStarredResponseData]): ParametersGistsListStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListStarredEndpoint]
  }
  
  extension [Self <: ParametersGistsListStarredEndpoint](x: Self) {
    
    inline def setParameters(value: GistsListStarredEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsListStarredResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
