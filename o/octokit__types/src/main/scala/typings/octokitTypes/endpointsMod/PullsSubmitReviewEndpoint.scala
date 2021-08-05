package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.APPROVE
import typings.octokitTypes.octokitTypesStrings.COMMENT
import typings.octokitTypes.octokitTypesStrings.REQUEST_CHANGES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsSubmitReviewEndpoint extends StObject {
  
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: APPROVE | REQUEST_CHANGES | COMMENT
  
  var owner: String
  
  var pull_number: Double
  
  var repo: String
  
  var review_id: Double
}
object PullsSubmitReviewEndpoint {
  
  inline def apply(
    event: APPROVE | REQUEST_CHANGES | COMMENT,
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double
  ): PullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewEndpoint]
  }
  
  extension [Self <: PullsSubmitReviewEndpoint](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEvent(value: APPROVE | REQUEST_CHANGES | COMMENT): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setReview_id(value: Double): Self = StObject.set(x, "review_id", value.asInstanceOf[js.Any])
  }
}
