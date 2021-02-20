package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetUserAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetUserAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposSetUserAccessRestrictionsEndpoint = js.native
  
  var request: ReposSetUserAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData] = js.native
}
object ParametersReposSetUserAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetUserAccessRestrictionsEndpoint,
    request: ReposSetUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]
  ): ParametersReposSetUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetUserAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetUserAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposSetUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposSetUserAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetUserAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetUserAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
