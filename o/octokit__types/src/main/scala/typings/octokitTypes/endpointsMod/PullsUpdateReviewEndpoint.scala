package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsUpdateReviewEndpoint extends StObject {
  
  /**
    * The body text of the pull request review.
    */
  var body: String
  
  var owner: String
  
  var pull_number: Double
  
  var repo: String
  
  var review_id: Double
}
object PullsUpdateReviewEndpoint {
  
  inline def apply(body: String, owner: String, pull_number: Double, repo: String, review_id: Double): PullsUpdateReviewEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateReviewEndpoint]
  }
  
  extension [Self <: PullsUpdateReviewEndpoint](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
  }
}
