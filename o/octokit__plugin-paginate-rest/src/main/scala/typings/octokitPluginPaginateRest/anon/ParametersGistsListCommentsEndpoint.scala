package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListCommentsEndpoint
import typings.octokitTypes.endpointsMod.GistsListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsListCommentsEndpoint extends StObject {
  
  var parameters: GistsListCommentsEndpoint
  
  var response: OctokitResponse[GistsListCommentsResponseData]
}
object ParametersGistsListCommentsEndpoint {
  
  inline def apply(parameters: GistsListCommentsEndpoint, response: OctokitResponse[GistsListCommentsResponseData]): ParametersGistsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommentsEndpoint]
  }
  
  extension [Self <: ParametersGistsListCommentsEndpoint](x: Self) {
    
    inline def setParameters(value: GistsListCommentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
