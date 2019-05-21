package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForPullRequestReviewCommentEndpoint extends js.Object {
  var comment_id: scala.Double
  var content: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReactionsCreateForPullRequestReviewCommentEndpoint {
  @scala.inline
  def apply(
    comment_id: scala.Double,
    content: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String
  ): ReactionsCreateForPullRequestReviewCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, content = content, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReactionsCreateForPullRequestReviewCommentEndpoint]
  }
}

