package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsDeleteCommentEndpoint extends StObject {
  
  var parameters: GistsDeleteCommentEndpoint
  
  var request: GistsDeleteCommentRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersGistsDeleteCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsDeleteCommentEndpoint,
    request: GistsDeleteCommentRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersGistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsDeleteCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsDeleteCommentEndpointMutableBuilder[Self <: ParametersGistsDeleteCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsDeleteCommentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsDeleteCommentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
