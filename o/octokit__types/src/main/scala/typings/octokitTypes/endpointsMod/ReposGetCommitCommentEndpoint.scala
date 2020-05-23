package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitCommentEndpoint extends js.Object {
  var comment_id: Double
  var owner: String
  var repo: String
}

object ReposGetCommitCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): ReposGetCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitCommentEndpoint]
  }
}

