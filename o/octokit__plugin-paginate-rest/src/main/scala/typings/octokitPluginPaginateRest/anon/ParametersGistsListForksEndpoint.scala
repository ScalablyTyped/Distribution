package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.GistsListForksEndpoint
import typings.octokitTypes.endpointsMod.GistsListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsListForksEndpoint extends StObject {
  
  var parameters: GistsListForksEndpoint
  
  var response: OctokitResponse[GistsListForksResponseData]
}
object ParametersGistsListForksEndpoint {
  
  @scala.inline
  def apply(parameters: GistsListForksEndpoint, response: OctokitResponse[GistsListForksResponseData]): ParametersGistsListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListForksEndpointMutableBuilder[Self <: ParametersGistsListForksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListForksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
