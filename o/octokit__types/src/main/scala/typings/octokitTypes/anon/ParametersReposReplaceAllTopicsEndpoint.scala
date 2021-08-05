package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposReplaceAllTopicsEndpoint extends StObject {
  
  var parameters: ReposReplaceAllTopicsEndpoint
  
  var request: ReposReplaceAllTopicsRequestOptions
  
  var response: OctokitResponse[ReposReplaceAllTopicsResponseData]
}
object ParametersReposReplaceAllTopicsEndpoint {
  
  inline def apply(
    parameters: ReposReplaceAllTopicsEndpoint,
    request: ReposReplaceAllTopicsRequestOptions,
    response: OctokitResponse[ReposReplaceAllTopicsResponseData]
  ): ParametersReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceAllTopicsEndpoint]
  }
  
  extension [Self <: ParametersReposReplaceAllTopicsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposReplaceAllTopicsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposReplaceAllTopicsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposReplaceAllTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
