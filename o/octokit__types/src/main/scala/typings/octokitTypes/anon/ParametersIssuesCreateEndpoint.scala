package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesCreateEndpoint extends StObject {
  
  var parameters: IssuesCreateEndpoint = js.native
  
  var request: IssuesCreateRequestOptions = js.native
  
  var response: OctokitResponse[IssuesCreateResponseData] = js.native
}
object ParametersIssuesCreateEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateEndpoint,
    request: IssuesCreateRequestOptions,
    response: OctokitResponse[IssuesCreateResponseData]
  ): ParametersIssuesCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateEndpointMutableBuilder[Self <: ParametersIssuesCreateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesCreateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
