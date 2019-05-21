package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteCommentEndpoint extends js.Object {
  var comment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesDeleteCommentEndpoint {
  @scala.inline
  def apply(comment_id: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesDeleteCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesDeleteCommentEndpoint]
  }
}

