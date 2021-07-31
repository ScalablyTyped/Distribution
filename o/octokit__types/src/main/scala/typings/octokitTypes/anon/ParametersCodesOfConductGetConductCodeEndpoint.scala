package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersCodesOfConductGetConductCodeEndpoint extends StObject {
  
  var parameters: CodesOfConductGetConductCodeEndpoint
  
  var request: CodesOfConductGetConductCodeRequestOptions
  
  var response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
}
object ParametersCodesOfConductGetConductCodeEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodesOfConductGetConductCodeEndpoint,
    request: CodesOfConductGetConductCodeRequestOptions,
    response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
  ): ParametersCodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetConductCodeEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodesOfConductGetConductCodeEndpointMutableBuilder[Self <: ParametersCodesOfConductGetConductCodeEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodesOfConductGetConductCodeEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodesOfConductGetConductCodeRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetConductCodeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
