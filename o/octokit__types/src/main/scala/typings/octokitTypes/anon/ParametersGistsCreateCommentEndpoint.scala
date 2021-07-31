package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsCreateCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsCreateCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsCreateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsCreateCommentEndpoint extends StObject {
  
  var parameters: GistsCreateCommentEndpoint
  
  var request: GistsCreateCommentRequestOptions
  
  var response: OctokitResponse[GistsCreateCommentResponseData]
}
object ParametersGistsCreateCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsCreateCommentEndpoint,
    request: GistsCreateCommentRequestOptions,
    response: OctokitResponse[GistsCreateCommentResponseData]
  ): ParametersGistsCreateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsCreateCommentEndpointMutableBuilder[Self <: ParametersGistsCreateCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsCreateCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsCreateCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsCreateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
