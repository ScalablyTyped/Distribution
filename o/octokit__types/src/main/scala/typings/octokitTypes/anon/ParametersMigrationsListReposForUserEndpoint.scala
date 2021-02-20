package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListReposForUserEndpoint extends StObject {
  
  var parameters: MigrationsListReposForUserEndpoint = js.native
  
  var request: MigrationsListReposForUserRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsListReposForUserResponseData] = js.native
}
object ParametersMigrationsListReposForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListReposForUserEndpoint,
    request: MigrationsListReposForUserRequestOptions,
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): ParametersMigrationsListReposForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListReposForUserEndpointMutableBuilder[Self <: ParametersMigrationsListReposForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListReposForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsListReposForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListReposForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
