package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposGetAccessRestrictionsEndpoint = js.native
  
  var request: ReposGetAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAccessRestrictionsResponseData] = js.native
}
object ParametersReposGetAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAccessRestrictionsEndpoint,
    request: ReposGetAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposGetAccessRestrictionsResponseData]
  ): ParametersReposGetAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposGetAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
