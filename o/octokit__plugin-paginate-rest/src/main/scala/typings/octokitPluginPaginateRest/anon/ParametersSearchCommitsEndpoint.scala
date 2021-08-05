package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchCommitsEndpoint extends StObject {
  
  var parameters: SearchCommitsEndpoint
  
  var response: OctokitResponse[SearchCommitsResponseData] & `18`
}
object ParametersSearchCommitsEndpoint {
  
  inline def apply(parameters: SearchCommitsEndpoint, response: OctokitResponse[SearchCommitsResponseData] & `18`): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
  
  extension [Self <: ParametersSearchCommitsEndpoint](x: Self) {
    
    inline def setParameters(value: SearchCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchCommitsResponseData] & `18`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
