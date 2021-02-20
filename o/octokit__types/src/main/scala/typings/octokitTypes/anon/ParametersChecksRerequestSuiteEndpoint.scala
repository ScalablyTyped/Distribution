package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksRerequestSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksRerequestSuiteRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksRerequestSuiteEndpoint extends StObject {
  
  var parameters: ChecksRerequestSuiteEndpoint = js.native
  
  var request: ChecksRerequestSuiteRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersChecksRerequestSuiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksRerequestSuiteEndpoint,
    request: ChecksRerequestSuiteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersChecksRerequestSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksRerequestSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksRerequestSuiteEndpointMutableBuilder[Self <: ParametersChecksRerequestSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksRerequestSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksRerequestSuiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
