package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsUpdateCommentRequestOptions
import typings.octokitTypes.endpointsMod.GistsUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsUpdateCommentEndpoint extends StObject {
  
  var parameters: GistsUpdateCommentEndpoint
  
  var request: GistsUpdateCommentRequestOptions
  
  var response: OctokitResponse[GistsUpdateCommentResponseData]
}
object ParametersGistsUpdateCommentEndpoint {
  
  inline def apply(
    parameters: GistsUpdateCommentEndpoint,
    request: GistsUpdateCommentRequestOptions,
    response: OctokitResponse[GistsUpdateCommentResponseData]
  ): ParametersGistsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUpdateCommentEndpoint]
  }
  
  extension [Self <: ParametersGistsUpdateCommentEndpoint](x: Self) {
    
    inline def setParameters(value: GistsUpdateCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: GistsUpdateCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[GistsUpdateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
