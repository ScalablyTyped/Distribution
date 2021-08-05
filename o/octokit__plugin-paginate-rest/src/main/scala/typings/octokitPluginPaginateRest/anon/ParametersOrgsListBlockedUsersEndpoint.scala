package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListBlockedUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListBlockedUsersEndpoint extends StObject {
  
  var parameters: OrgsListBlockedUsersEndpoint
  
  var response: OctokitResponse[OrgsListBlockedUsersResponseData]
}
object ParametersOrgsListBlockedUsersEndpoint {
  
  inline def apply(
    parameters: OrgsListBlockedUsersEndpoint,
    response: OctokitResponse[OrgsListBlockedUsersResponseData]
  ): ParametersOrgsListBlockedUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListBlockedUsersEndpoint]
  }
  
  extension [Self <: ParametersOrgsListBlockedUsersEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListBlockedUsersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListBlockedUsersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
