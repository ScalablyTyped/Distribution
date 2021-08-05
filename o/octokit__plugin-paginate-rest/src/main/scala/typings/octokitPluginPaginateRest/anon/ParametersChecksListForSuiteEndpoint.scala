package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksListForSuiteEndpoint extends StObject {
  
  var parameters: ChecksListForSuiteEndpoint
  
  var response: OctokitResponse[ChecksListForSuiteResponseData] & `13`
}
object ParametersChecksListForSuiteEndpoint {
  
  inline def apply(
    parameters: ChecksListForSuiteEndpoint,
    response: OctokitResponse[ChecksListForSuiteResponseData] & `13`
  ): ParametersChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForSuiteEndpoint]
  }
  
  extension [Self <: ParametersChecksListForSuiteEndpoint](x: Self) {
    
    inline def setParameters(value: ChecksListForSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ChecksListForSuiteResponseData] & `13`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
