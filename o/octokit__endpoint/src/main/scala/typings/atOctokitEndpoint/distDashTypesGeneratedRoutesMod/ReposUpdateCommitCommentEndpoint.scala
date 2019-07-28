package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateCommitCommentEndpoint extends js.Object {
  var body: String
  var comment_id: Double
  var owner: String
  var repo: String
}

object ReposUpdateCommitCommentEndpoint {
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, repo: String): ReposUpdateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposUpdateCommitCommentEndpoint]
  }
}

