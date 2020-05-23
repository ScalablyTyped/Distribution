package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateCommitCommentEndpoint extends js.Object {
  /**
    * The contents of the comment
    */
  var body: String
  var comment_id: Double
  var owner: String
  var repo: String
}

object ReposUpdateCommitCommentEndpoint {
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, repo: String): ReposUpdateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateCommitCommentEndpoint]
  }
}

