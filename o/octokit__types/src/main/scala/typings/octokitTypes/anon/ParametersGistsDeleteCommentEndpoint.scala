package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsDeleteCommentEndpoint
import typings.octokitTypes.endpointsMod.GistsDeleteCommentRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsDeleteCommentEndpoint extends js.Object {
  
  var parameters: GistsDeleteCommentEndpoint = js.native
  
  var request: GistsDeleteCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGistsDeleteCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsDeleteCommentEndpoint,
    request: GistsDeleteCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGistsDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsDeleteCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsDeleteCommentEndpointOps[Self <: ParametersGistsDeleteCommentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: GistsDeleteCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsDeleteCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
