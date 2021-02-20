package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typings.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListRequestedReviewersEndpoint extends StObject {
  
  var parameters: PullsListRequestedReviewersEndpoint = js.native
  
  var response: OctokitResponse[PullsListRequestedReviewersResponseData] with `15` = js.native
}
object ParametersPullsListRequestedReviewersEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListRequestedReviewersEndpoint,
    response: OctokitResponse[PullsListRequestedReviewersResponseData] with `15`
  ): ParametersPullsListRequestedReviewersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListRequestedReviewersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListRequestedReviewersEndpointMutableBuilder[Self <: ParametersPullsListRequestedReviewersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListRequestedReviewersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListRequestedReviewersResponseData] with `15`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
