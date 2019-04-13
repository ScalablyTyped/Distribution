package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateCommentParams extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: java.lang.String
  var comment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesUpdateCommentParams {
  @scala.inline
  def apply(body: java.lang.String, comment_id: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesUpdateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesUpdateCommentParams]
  }
}

