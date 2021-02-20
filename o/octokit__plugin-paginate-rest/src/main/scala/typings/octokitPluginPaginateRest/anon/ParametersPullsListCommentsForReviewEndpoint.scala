package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListCommentsForReviewEndpoint extends StObject {
  
  var parameters: PullsListCommentsForReviewEndpoint = js.native
  
  var response: OctokitResponse[PullsListCommentsForReviewResponseData] = js.native
}
object ParametersPullsListCommentsForReviewEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListCommentsForReviewEndpoint,
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): ParametersPullsListCommentsForReviewEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListCommentsForReviewEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListCommentsForReviewEndpointMutableBuilder[Self <: ParametersPullsListCommentsForReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListCommentsForReviewEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
