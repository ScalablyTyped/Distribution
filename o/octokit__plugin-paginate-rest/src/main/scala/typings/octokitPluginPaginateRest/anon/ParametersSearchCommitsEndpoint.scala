package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchCommitsEndpoint
import typings.octokitTypes.endpointsMod.SearchCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchCommitsEndpoint extends StObject {
  
  var parameters: SearchCommitsEndpoint = js.native
  
  var response: OctokitResponse[SearchCommitsResponseData] with `18` = js.native
}
object ParametersSearchCommitsEndpoint {
  
  @scala.inline
  def apply(parameters: SearchCommitsEndpoint, response: OctokitResponse[SearchCommitsResponseData] with `18`): ParametersSearchCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchCommitsEndpointMutableBuilder[Self <: ParametersSearchCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCommitsResponseData] with `18`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
