package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewRequestOptions
import typings.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsCreateReviewEndpoint extends StObject {
  
  var parameters: PullsCreateReviewEndpoint = js.native
  
  var request: PullsCreateReviewRequestOptions = js.native
  
  var response: OctokitResponse[PullsCreateReviewResponseData] = js.native
}
object ParametersPullsCreateReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsCreateReviewEndpoint,
    request: PullsCreateReviewRequestOptions,
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): ParametersPullsCreateReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsCreateReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsCreateReviewEndpointMutableBuilder[Self <: ParametersPullsCreateReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsCreateReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsCreateReviewRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
