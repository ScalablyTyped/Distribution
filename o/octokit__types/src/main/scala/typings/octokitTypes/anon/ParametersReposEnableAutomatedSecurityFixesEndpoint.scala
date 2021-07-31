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
  
  @scala.inline
  def apply(
    parameters: ReposEnableAutomatedSecurityFixesEndpoint,
    request: ReposEnableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposEnableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposEnableAutomatedSecurityFixesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposEnableAutomatedSecurityFixesEndpointMutableBuilder[Self <: ParametersReposEnableAutomatedSecurityFixesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposEnableAutomatedSecurityFixesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposEnableAutomatedSecurityFixesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
