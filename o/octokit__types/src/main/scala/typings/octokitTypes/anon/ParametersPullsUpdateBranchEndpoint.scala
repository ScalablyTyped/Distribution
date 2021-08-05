package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateBranchEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateBranchRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsUpdateBranchEndpoint extends StObject {
  
  var parameters: PullsUpdateBranchEndpoint
  
  var request: PullsUpdateBranchRequestOptions
  
  var response: OctokitResponse[PullsUpdateBranchResponseData]
}
object ParametersPullsUpdateBranchEndpoint {
  
  inline def apply(
    parameters: PullsUpdateBranchEndpoint,
    request: PullsUpdateBranchRequestOptions,
    response: OctokitResponse[PullsUpdateBranchResponseData]
  ): ParametersPullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateBranchEndpoint]
  }
  
  extension [Self <: ParametersPullsUpdateBranchEndpoint](x: Self) {
    
    inline def setParameters(value: PullsUpdateBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsUpdateBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsUpdateBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
