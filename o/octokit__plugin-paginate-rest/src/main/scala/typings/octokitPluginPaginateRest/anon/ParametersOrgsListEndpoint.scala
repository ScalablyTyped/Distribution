package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListEndpoint
import typings.octokitTypes.endpointsMod.OrgsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListEndpoint extends StObject {
  
  var parameters: OrgsListEndpoint = js.native
  
  var response: OctokitResponse[OrgsListResponseData] = js.native
}
object ParametersOrgsListEndpoint {
  
  @scala.inline
  def apply(parameters: OrgsListEndpoint, response: OctokitResponse[OrgsListResponseData]): ParametersOrgsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListEndpointMutableBuilder[Self <: ParametersOrgsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
