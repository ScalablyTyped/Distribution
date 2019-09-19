package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewCommentReplyParams extends js.Object {
  /**
    * The text of the review comment.
    */
  var body: String
  var comment_id: Double
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCreateReviewCommentReplyParams {
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, pull_number: Double, repo: String): PullsCreateReviewCommentReplyParams = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, owner = owner, pull_number = pull_number, repo = repo)
  
    __obj.asInstanceOf[PullsCreateReviewCommentReplyParams]
  }
}

