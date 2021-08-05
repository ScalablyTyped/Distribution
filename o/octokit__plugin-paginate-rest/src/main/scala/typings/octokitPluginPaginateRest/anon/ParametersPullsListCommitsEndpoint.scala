package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommitsEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListCommitsEndpoint extends StObject {
  
  var parameters: PullsListCommitsEndpoint
  
  var response: OctokitResponse[PullsListCommitsResponseData]
}
object ParametersPullsListCommitsEndpoint {
  
  inline def apply(parameters: PullsListCommitsEndpoint, response: OctokitResponse[PullsListCommitsResponseData]): ParametersPullsListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommitsEndpoint]
  }
  
  extension [Self <: ParametersPullsListCommitsEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
