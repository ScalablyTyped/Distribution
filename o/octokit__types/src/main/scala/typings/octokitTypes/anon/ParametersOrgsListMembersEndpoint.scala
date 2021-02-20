package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListMembersEndpoint extends StObject {
  
  var parameters: OrgsListMembersEndpoint = js.native
  
  var request: OrgsListMembersRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListMembersResponseData] = js.native
}
object ParametersOrgsListMembersEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListMembersEndpoint,
    request: OrgsListMembersRequestOptions,
    response: OctokitResponse[OrgsListMembersResponseData]
  ): ParametersOrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListMembersEndpointMutableBuilder[Self <: ParametersOrgsListMembersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListMembersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
