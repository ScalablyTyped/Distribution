package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteCommentEndpoint extends js.Object {
  var comment_id: Double
  var owner: String
  var repo: String
}

object IssuesDeleteCommentEndpoint {
  @scala.inline
  def apply(comment_id: Double, owner: String, repo: String): IssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteCommentEndpoint]
  }
}

