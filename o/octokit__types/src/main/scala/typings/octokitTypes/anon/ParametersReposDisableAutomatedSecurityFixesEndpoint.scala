package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDisableAutomatedSecurityFixesEndpoint extends StObject {
  
  var parameters: ReposDisableAutomatedSecurityFixesEndpoint
  
  var request: ReposDisableAutomatedSecurityFixesRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDisableAutomatedSecurityFixesEndpoint {
  
  inline def apply(
    parameters: ReposDisableAutomatedSecurityFixesEndpoint,
    request: ReposDisableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDisableAutomatedSecurityFixesEndpoint]
  }
  
  extension [Self <: ParametersReposDisableAutomatedSecurityFixesEndpoint](x: Self) {
    
    inline def setParameters(value: ReposDisableAutomatedSecurityFixesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposDisableAutomatedSecurityFixesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
