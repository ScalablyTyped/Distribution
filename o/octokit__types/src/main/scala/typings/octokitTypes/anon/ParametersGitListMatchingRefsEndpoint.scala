package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GitListMatchingRefsEndpoint
import typings.octokitTypes.endpointsMod.GitListMatchingRefsRequestOptions
import typings.octokitTypes.endpointsMod.GitListMatchingRefsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGitListMatchingRefsEndpoint extends StObject {
  
  var parameters: GitListMatchingRefsEndpoint
  
  var request: GitListMatchingRefsRequestOptions
  
  var response: OctokitResponse[GitListMatchingRefsResponseData]
}
object ParametersGitListMatchingRefsEndpoint {
  
  inline def apply(
    parameters: GitListMatchingRefsEndpoint,
    request: GitListMatchingRefsRequestOptions,
    response: OctokitResponse[GitListMatchingRefsResponseData]
  ): ParametersGitListMatchingRefsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGitListMatchingRefsEndpoint]
  }
  
  extension [Self <: ParametersGitListMatchingRefsEndpoint](x: Self) {
    
    inline def setParameters(value: GitListMatchingRefsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GitListMatchingRefsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GitListMatchingRefsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
