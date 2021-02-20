package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesEndpoint
import typings.octokitTypes.endpointsMod.ReposDisableAutomatedSecurityFixesRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDisableAutomatedSecurityFixesEndpoint extends StObject {
  
  var parameters: ReposDisableAutomatedSecurityFixesEndpoint = js.native
  
  var request: ReposDisableAutomatedSecurityFixesRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDisableAutomatedSecurityFixesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDisableAutomatedSecurityFixesEndpoint,
    request: ReposDisableAutomatedSecurityFixesRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDisableAutomatedSecurityFixesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDisableAutomatedSecurityFixesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDisableAutomatedSecurityFixesEndpointMutableBuilder[Self <: ParametersReposDisableAutomatedSecurityFixesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDisableAutomatedSecurityFixesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDisableAutomatedSecurityFixesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
