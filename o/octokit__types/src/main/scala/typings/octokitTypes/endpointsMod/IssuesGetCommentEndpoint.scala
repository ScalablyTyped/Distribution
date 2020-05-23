package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetCommentEndpoint extends js.Object {
  var comment_id: Double
  var owner: String
  var repo: String
}

object IssuesGetCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): IssuesGetCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetCommentEndpoint]
  }
}

