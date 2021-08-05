package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsGetStatusForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsGetStatusForAuthenticatedUserEndpoint
  
  var request: MigrationsGetStatusForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
}
object ParametersMigrationsGetStatusForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: MigrationsGetStatusForAuthenticatedUserEndpoint,
    request: MigrationsGetStatusForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
  ): ParametersMigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersMigrationsGetStatusForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsGetStatusForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsGetStatusForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
