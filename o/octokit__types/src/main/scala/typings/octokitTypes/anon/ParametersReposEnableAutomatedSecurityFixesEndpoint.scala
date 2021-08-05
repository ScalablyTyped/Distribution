package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposEnableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposEnableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposEnableAutomatedSecurityFixesEndpoint extends StObject {
  
  var parameters: ReposEnableAutomatedSecurityFixesEndpoint
  
  var request: ReposEnableAutomatedSecurityFixesRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposEnableAutomatedSecurityFixesEndpoint {
  
  inline def apply(
    parameters: ReposEnableAutomatedSecurityFixesEndpoint,
    request: ReposEnableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposEnableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposEnableAutomatedSecurityFixesEndpoint]
  }
  
  extension [Self <: ParametersReposEnableAutomatedSecurityFixesEndpoint](x: Self) {
    
    inline def setParameters(value: ReposEnableAutomatedSecurityFixesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposEnableAutomatedSecurityFixesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
