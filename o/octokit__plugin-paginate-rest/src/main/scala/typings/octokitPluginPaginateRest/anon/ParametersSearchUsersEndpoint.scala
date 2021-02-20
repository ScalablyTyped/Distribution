package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchUsersEndpoint
import typings.octokitTypes.endpointsMod.SearchUsersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchUsersEndpoint extends StObject {
  
  var parameters: SearchUsersEndpoint = js.native
  
  var response: OctokitResponse[SearchUsersResponseData] with `23` = js.native
}
object ParametersSearchUsersEndpoint {
  
  @scala.inline
  def apply(parameters: SearchUsersEndpoint, response: OctokitResponse[SearchUsersResponseData] with `23`): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchUsersEndpointMutableBuilder[Self <: ParametersSearchUsersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchUsersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchUsersResponseData] with `23`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
