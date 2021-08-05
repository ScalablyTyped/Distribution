package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListEndpoint
import typings.octokitTypes.endpointsMod.UsersListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersUsersListEndpoint extends StObject {
  
  var parameters: UsersListEndpoint
  
  var response: OctokitResponse[UsersListResponseData]
}
object ParametersUsersListEndpoint {
  
  inline def apply(parameters: UsersListEndpoint, response: OctokitResponse[UsersListResponseData]): ParametersUsersListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListEndpoint]
  }
  
  extension [Self <: ParametersUsersListEndpoint](x: Self) {
    
    inline def setParameters(value: UsersListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[UsersListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
