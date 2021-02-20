package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsGetArchiveForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetArchiveForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsGetArchiveForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsGetArchiveForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetArchiveForAuthenticatedUserEndpoint,
    request: MigrationsGetArchiveForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetArchiveForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsGetArchiveForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetArchiveForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetArchiveForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
