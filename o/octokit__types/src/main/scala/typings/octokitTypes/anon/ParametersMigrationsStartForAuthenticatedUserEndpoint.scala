package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsStartForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsStartForAuthenticatedUserEndpoint
  
  var request: MigrationsStartForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]
}
object ParametersMigrationsStartForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: MigrationsStartForAuthenticatedUserEndpoint,
    request: MigrationsStartForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]
  ): ParametersMigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersMigrationsStartForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsStartForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsStartForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
