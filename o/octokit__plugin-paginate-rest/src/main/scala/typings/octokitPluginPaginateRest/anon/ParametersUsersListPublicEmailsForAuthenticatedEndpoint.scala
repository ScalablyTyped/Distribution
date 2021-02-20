package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedEndpoint
import typings.octokitTypes.endpointsMod.UsersListPublicEmailsForAuthenticatedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersUsersListPublicEmailsForAuthenticatedEndpoint extends StObject {
  
  var parameters: UsersListPublicEmailsForAuthenticatedEndpoint = js.native
  
  var response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData] = js.native
}
object ParametersUsersListPublicEmailsForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(
    parameters: UsersListPublicEmailsForAuthenticatedEndpoint,
    response: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]
  ): ParametersUsersListPublicEmailsForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersUsersListPublicEmailsForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersUsersListPublicEmailsForAuthenticatedEndpointMutableBuilder[Self <: ParametersUsersListPublicEmailsForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: UsersListPublicEmailsForAuthenticatedEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicEmailsForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
