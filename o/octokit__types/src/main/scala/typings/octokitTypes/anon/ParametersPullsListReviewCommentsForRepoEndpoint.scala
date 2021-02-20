package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoRequestOptions
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListReviewCommentsForRepoEndpoint extends StObject {
  
  var parameters: PullsListReviewCommentsForRepoEndpoint = js.native
  
  var request: PullsListReviewCommentsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData] = js.native
}
object ParametersPullsListReviewCommentsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsForRepoEndpoint,
    request: PullsListReviewCommentsForRepoRequestOptions,
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): ParametersPullsListReviewCommentsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListReviewCommentsForRepoEndpointMutableBuilder[Self <: ParametersPullsListReviewCommentsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListReviewCommentsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListReviewCommentsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
