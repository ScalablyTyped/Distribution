package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchLabelsEndpoint extends StObject {
  
  var parameters: SearchLabelsEndpoint = js.native
  
  var response: OctokitResponse[SearchLabelsResponseData] with `20` = js.native
}
object ParametersSearchLabelsEndpoint {
  
  @scala.inline
  def apply(parameters: SearchLabelsEndpoint, response: OctokitResponse[SearchLabelsResponseData] with `20`): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchLabelsEndpointMutableBuilder[Self <: ParametersSearchLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchLabelsResponseData] with `20`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
