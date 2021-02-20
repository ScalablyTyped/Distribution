package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListReviewsEndpoint extends StObject {
  
  var parameters: PullsListReviewsEndpoint = js.native
  
  var response: OctokitResponse[PullsListReviewsResponseData] = js.native
}
object ParametersPullsListReviewsEndpoint {
  
  @scala.inline
  def apply(parameters: PullsListReviewsEndpoint, response: OctokitResponse[PullsListReviewsResponseData]): ParametersPullsListReviewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListReviewsEndpointMutableBuilder[Self <: ParametersPullsListReviewsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListReviewsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
