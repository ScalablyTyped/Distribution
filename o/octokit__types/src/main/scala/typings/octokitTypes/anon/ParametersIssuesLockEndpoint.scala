package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesLockEndpoint
import typings.octokitTypes.endpointsMod.IssuesLockRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesLockEndpoint extends StObject {
  
  var parameters: IssuesLockEndpoint
  
  var request: IssuesLockRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersIssuesLockEndpoint {
  
  inline def apply(
    parameters: IssuesLockEndpoint,
    request: IssuesLockRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersIssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesLockEndpoint]
  }
  
  extension [Self <: ParametersIssuesLockEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesLockEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesLockRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
