package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typings.octokitTypes.endpointsMod.SearchLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersSearchLabelsEndpoint extends StObject {
  
  var parameters: SearchLabelsEndpoint
  
  var response: OctokitResponse[SearchLabelsResponseData] & `20`
}
object ParametersSearchLabelsEndpoint {
  
  inline def apply(parameters: SearchLabelsEndpoint, response: OctokitResponse[SearchLabelsResponseData] & `20`): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
  
  extension [Self <: ParametersSearchLabelsEndpoint](x: Self) {
    
    inline def setParameters(value: SearchLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[SearchLabelsResponseData] & `20`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
