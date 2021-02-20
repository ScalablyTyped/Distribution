package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.MigrationsGetStatusForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetStatusForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsGetStatusForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsGetStatusForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData] = js.native
}
object ParametersMigrationsGetStatusForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetStatusForAuthenticatedUserEndpoint,
    request: MigrationsGetStatusForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]
  ): ParametersMigrationsGetStatusForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetStatusForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetStatusForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsGetStatusForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetStatusForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetStatusForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetStatusForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
