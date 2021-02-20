package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductRequestOptions
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodesOfConductGetAllCodesOfConductEndpoint extends StObject {
  
  var parameters: CodesOfConductGetAllCodesOfConductEndpoint = js.native
  
  var request: CodesOfConductGetAllCodesOfConductRequestOptions = js.native
  
  var response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData] = js.native
}
object ParametersCodesOfConductGetAllCodesOfConductEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodesOfConductGetAllCodesOfConductEndpoint,
    request: CodesOfConductGetAllCodesOfConductRequestOptions,
    response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
  ): ParametersCodesOfConductGetAllCodesOfConductEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodesOfConductGetAllCodesOfConductEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodesOfConductGetAllCodesOfConductEndpointMutableBuilder[Self <: ParametersCodesOfConductGetAllCodesOfConductEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodesOfConductGetAllCodesOfConductEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodesOfConductGetAllCodesOfConductRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
