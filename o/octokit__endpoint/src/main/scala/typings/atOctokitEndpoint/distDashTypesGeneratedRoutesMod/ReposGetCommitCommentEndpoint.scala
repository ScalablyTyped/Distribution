package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

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
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetCommitCommentEndpoint]
  }
}

