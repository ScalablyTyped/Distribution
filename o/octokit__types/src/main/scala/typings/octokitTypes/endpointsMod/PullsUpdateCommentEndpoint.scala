package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateCommentEndpoint extends js.Object {
  /**
    * The text of the reply to the review comment.
    */
  var body: String
  var comment_id: Double
  var owner: String
  var repo: String
}

object PullsUpdateCommentEndpoint {
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, repo: String): PullsUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateCommentEndpoint]
  }
}

