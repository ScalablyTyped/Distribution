package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsGetCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsGetCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsGetCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsGetCommentEndpoint extends StObject {
  
  var parameters: GistsGetCommentEndpoint
  
  var request: GistsGetCommentRequestOptions
  
  var response: OctokitResponse[GistsGetCommentResponseData]
}
object ParametersGistsGetCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsGetCommentEndpoint,
    request: GistsGetCommentRequestOptions,
    response: OctokitResponse[GistsGetCommentResponseData]
  ): ParametersGistsGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsGetCommentEndpointMutableBuilder[Self <: ParametersGistsGetCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsGetCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsGetCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
