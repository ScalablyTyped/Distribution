package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForPullRequestReviewCommentEndpoint extends js.Object {
  var comment_id: Double
  var content: String
  var owner: String
  var repo: String
}

object ReactionsCreateForPullRequestReviewCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, content: String, owner: String, repo: String): ReactionsCreateForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, content = content, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReactionsCreateForPullRequestReviewCommentEndpoint]
  }
}

