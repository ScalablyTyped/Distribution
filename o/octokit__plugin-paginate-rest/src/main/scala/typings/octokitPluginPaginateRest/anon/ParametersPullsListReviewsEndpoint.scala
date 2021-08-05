package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListReviewsEndpoint extends StObject {
  
  var parameters: PullsListReviewsEndpoint
  
  var response: OctokitResponse[PullsListReviewsResponseData]
}
object ParametersPullsListReviewsEndpoint {
  
  inline def apply(parameters: PullsListReviewsEndpoint, response: OctokitResponse[PullsListReviewsResponseData]): ParametersPullsListReviewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewsEndpoint]
  }
  
  extension [Self <: ParametersPullsListReviewsEndpoint](x: Self) {
    
    inline def setParameters(value: PullsListReviewsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListReviewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
