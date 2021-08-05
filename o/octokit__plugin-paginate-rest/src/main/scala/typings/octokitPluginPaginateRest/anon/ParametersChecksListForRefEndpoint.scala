package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksListForRefEndpoint extends StObject {
  
  var parameters: ChecksListForRefEndpoint
  
  var response: OctokitResponse[ChecksListForRefResponseData] & `13`
}
object ParametersChecksListForRefEndpoint {
  
  inline def apply(
    parameters: ChecksListForRefEndpoint,
    response: OctokitResponse[ChecksListForRefResponseData] & `13`
  ): ParametersChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForRefEndpoint]
  }
  
  extension [Self <: ParametersChecksListForRefEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksListForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksListForRefResponseData] & `13`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
