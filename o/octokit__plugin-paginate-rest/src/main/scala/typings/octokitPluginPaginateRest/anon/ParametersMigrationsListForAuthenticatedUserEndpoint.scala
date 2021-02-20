package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsListForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData] = js.native
}
object ParametersMigrationsListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListForAuthenticatedUserEndpoint,
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): ParametersMigrationsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
