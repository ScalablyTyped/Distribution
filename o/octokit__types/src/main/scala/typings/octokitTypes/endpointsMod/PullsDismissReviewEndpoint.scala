package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsDismissReviewEndpoint extends StObject {
  
  /**
    * The message for the pull request review dismissal
    */
  var message: String
  
  var owner: String
  
  var pull_number: Double
  
  var repo: String
  
  var review_id: Double
}
object PullsDismissReviewEndpoint {
  
  inline def apply(message: String, owner: String, pull_number: Double, repo: String, review_id: Double): PullsDismissReviewEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsDismissReviewEndpoint]
  }
  
  extension [Self <: PullsDismissReviewEndpoint](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
  }
}
