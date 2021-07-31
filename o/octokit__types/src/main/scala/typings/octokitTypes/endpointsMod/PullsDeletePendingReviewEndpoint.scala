package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsDeletePendingReviewEndpoint extends StObject {
  
  var owner: String
  
  var pull_number: Double
  
  var repo: String
  
  var review_id: Double
}
object PullsDeletePendingReviewEndpoint {
  
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String, review_id: Double): PullsDeletePendingReviewEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDeletePendingReviewEndpoint]
  }
  
  @scala.inline
  implicit class PullsDeletePendingReviewEndpointMutableBuilder[Self <: PullsDeletePendingReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
  }
}
