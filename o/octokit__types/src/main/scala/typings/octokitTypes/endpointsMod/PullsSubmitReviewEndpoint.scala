package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.APPROVE
import typings.octokitTypes.octokitTypesStrings.COMMENT
import typings.octokitTypes.octokitTypesStrings.REQUEST_CHANGES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullsSubmitReviewEndpoint extends js.Object {
  
  /**
    * The body text of the pull request review
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
    */
  var event: APPROVE | REQUEST_CHANGES | COMMENT = js.native
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
  
  var review_id: Double = js.native
}
object PullsSubmitReviewEndpoint {
  
  @scala.inline
  def apply(
    event: APPROVE | REQUEST_CHANGES | COMMENT,
    owner: String,
    pull_number: Double,
    repo: String,
    review_id: Double
  ): PullsSubmitReviewEndpoint = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], review_id = review_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewEndpoint]
  }
  
  @scala.inline
  implicit class PullsSubmitReviewEndpointOps[Self <: PullsSubmitReviewEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: APPROVE | REQUEST_CHANGES | COMMENT): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = this.set("pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview_id(value: Double): Self = this.set("review_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
}
