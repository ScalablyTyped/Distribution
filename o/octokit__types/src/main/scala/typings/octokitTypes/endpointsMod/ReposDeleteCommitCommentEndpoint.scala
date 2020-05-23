package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteCommitCommentEndpoint extends js.Object {
  var comment_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteCommitCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): ReposDeleteCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteCommitCommentEndpoint]
  }
}

