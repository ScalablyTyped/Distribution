package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListCommitsEndpoint
import typings.octokitTypes.endpointsMod.GistsListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsListCommitsEndpoint extends StObject {
  
  var parameters: GistsListCommitsEndpoint
  
  var response: OctokitResponse[GistsListCommitsResponseData]
}
object ParametersGistsListCommitsEndpoint {
  
  inline def apply(parameters: GistsListCommitsEndpoint, response: OctokitResponse[GistsListCommitsResponseData]): ParametersGistsListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommitsEndpoint]
  }
  
  extension [Self <: ParametersGistsListCommitsEndpoint](x: Self) {
    
    inline def setParameters(value: GistsListCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
