package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsUnlockRepoForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsUnlockRepoForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsUnlockRepoForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsUnlockRepoForAuthenticatedUserEndpoint,
    request: MigrationsUnlockRepoForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsUnlockRepoForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsUnlockRepoForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsUnlockRepoForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsUnlockRepoForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
