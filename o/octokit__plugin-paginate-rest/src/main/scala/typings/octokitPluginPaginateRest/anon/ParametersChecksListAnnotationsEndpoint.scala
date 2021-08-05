package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListAnnotationsEndpoint
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksListAnnotationsEndpoint extends StObject {
  
  var parameters: ChecksListAnnotationsEndpoint
  
  var response: OctokitResponse[ChecksListAnnotationsResponseData]
}
object ParametersChecksListAnnotationsEndpoint {
  
  inline def apply(
    parameters: ChecksListAnnotationsEndpoint,
    response: OctokitResponse[ChecksListAnnotationsResponseData]
  ): ParametersChecksListAnnotationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListAnnotationsEndpoint]
  }
  
  extension [Self <: ParametersChecksListAnnotationsEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksListAnnotationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksListAnnotationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
