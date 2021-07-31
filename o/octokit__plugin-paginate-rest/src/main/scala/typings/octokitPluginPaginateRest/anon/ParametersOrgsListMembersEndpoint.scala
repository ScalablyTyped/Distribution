package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListMembersEndpoint extends StObject {
  
  var parameters: OrgsListMembersEndpoint
  
  var response: OctokitResponse[OrgsListMembersResponseData]
}
object ParametersOrgsListMembersEndpoint {
  
  @scala.inline
  def apply(parameters: OrgsListMembersEndpoint, response: OctokitResponse[OrgsListMembersResponseData]): ParametersOrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListMembersEndpointMutableBuilder[Self <: ParametersOrgsListMembersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
