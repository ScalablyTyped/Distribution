package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListMembersEndpoint extends StObject {
  
  var parameters: OrgsListMembersEndpoint
  
  var request: OrgsListMembersRequestOptions
  
  var response: OctokitResponse[OrgsListMembersResponseData]
}
object ParametersOrgsListMembersEndpoint {
  
  inline def apply(
    parameters: OrgsListMembersEndpoint,
    request: OrgsListMembersRequestOptions,
    response: OctokitResponse[OrgsListMembersResponseData]
  ): ParametersOrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembersEndpoint]
  }
  
  extension [Self <: ParametersOrgsListMembersEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: OrgsListMembersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
