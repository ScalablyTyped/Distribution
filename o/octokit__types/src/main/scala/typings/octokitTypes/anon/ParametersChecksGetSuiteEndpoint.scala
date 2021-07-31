package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksGetSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksGetSuiteRequestOptions
import typings.octokitTypes.endpointsMod.ChecksGetSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksGetSuiteEndpoint extends StObject {
  
  var parameters: ChecksGetSuiteEndpoint
  
  var request: ChecksGetSuiteRequestOptions
  
  var response: OctokitResponse[ChecksGetSuiteResponseData]
}
object ParametersChecksGetSuiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksGetSuiteEndpoint,
    request: ChecksGetSuiteRequestOptions,
    response: OctokitResponse[ChecksGetSuiteResponseData]
  ): ParametersChecksGetSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksGetSuiteEndpointMutableBuilder[Self <: ParametersChecksGetSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksGetSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksGetSuiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksGetSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
