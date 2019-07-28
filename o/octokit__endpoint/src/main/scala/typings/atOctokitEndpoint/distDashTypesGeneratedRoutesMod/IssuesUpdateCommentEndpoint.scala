package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateCommentEndpoint extends js.Object {
  var body: String
  var comment_id: Double
  var owner: String
  var repo: String
}

object IssuesUpdateCommentEndpoint {
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, repo: String): IssuesUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesUpdateCommentEndpoint]
  }
}

