package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListPublicMembersEndpoint extends StObject {
  
  var parameters: OrgsListPublicMembersEndpoint
  
  var response: OctokitResponse[OrgsListPublicMembersResponseData]
}
object ParametersOrgsListPublicMembersEndpoint {
  
  inline def apply(
    parameters: OrgsListPublicMembersEndpoint,
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): ParametersOrgsListPublicMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPublicMembersEndpoint]
  }
  
  extension [Self <: ParametersOrgsListPublicMembersEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListPublicMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListPublicMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
