package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksCreateEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateRequestOptions
import typings.octokitTypes.endpointsMod.ChecksCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersChecksCreateEndpoint extends StObject {
  
  var parameters: ChecksCreateEndpoint
  
  var request: ChecksCreateRequestOptions
  
  var response: OctokitResponse[ChecksCreateResponseData]
}
object ParametersChecksCreateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksCreateEndpoint,
    request: ChecksCreateRequestOptions,
    response: OctokitResponse[ChecksCreateResponseData]
  ): ParametersChecksCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksCreateEndpointMutableBuilder[Self <: ParametersChecksCreateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksCreateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksCreateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
