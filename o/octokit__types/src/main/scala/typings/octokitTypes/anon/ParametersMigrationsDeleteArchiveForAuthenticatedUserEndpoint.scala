package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsDeleteArchiveForAuthenticatedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsDeleteArchiveForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsDeleteArchiveForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsDeleteArchiveForAuthenticatedUserEndpoint,
    request: MigrationsDeleteArchiveForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsDeleteArchiveForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsDeleteArchiveForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsDeleteArchiveForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
