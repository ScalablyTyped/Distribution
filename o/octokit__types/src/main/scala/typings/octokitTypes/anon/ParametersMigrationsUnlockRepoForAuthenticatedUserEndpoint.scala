package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsUnlockRepoForAuthenticatedUserEndpoint
  
  var request: MigrationsUnlockRepoForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: MigrationsUnlockRepoForAuthenticatedUserEndpoint,
    request: MigrationsUnlockRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: MigrationsUnlockRepoForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: MigrationsUnlockRepoForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
