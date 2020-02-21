package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewCommentReplyParams]
  }
}

