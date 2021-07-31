package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkThreadAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkThreadAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityMarkThreadAsReadEndpoint extends StObject {
  
  var parameters: ActivityMarkThreadAsReadEndpoint
  
  var request: ActivityMarkThreadAsReadRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityMarkThreadAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkThreadAsReadEndpoint,
    request: ActivityMarkThreadAsReadRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityMarkThreadAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkThreadAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityMarkThreadAsReadEndpointMutableBuilder[Self <: ParametersActivityMarkThreadAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityMarkThreadAsReadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityMarkThreadAsReadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
