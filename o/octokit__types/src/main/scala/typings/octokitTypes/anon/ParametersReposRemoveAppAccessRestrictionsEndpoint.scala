package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveAppAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposRemoveAppAccessRestrictionsEndpoint = js.native
  
  var request: ReposRemoveAppAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData] = js.native
}
object ParametersReposRemoveAppAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveAppAccessRestrictionsEndpoint,
    request: ReposRemoveAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]
  ): ParametersReposRemoveAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveAppAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveAppAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposRemoveAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposRemoveAppAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveAppAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveAppAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
