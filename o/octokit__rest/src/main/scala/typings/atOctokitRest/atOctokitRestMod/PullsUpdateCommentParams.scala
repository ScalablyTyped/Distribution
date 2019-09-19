package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateCommentParams extends js.Object {
  /**
    * The text of the reply to the review comment.
    */
  var body: String
  var comment_id: Double
  var owner: String
  var repo: String
}

object PullsUpdateCommentParams {
  @scala.inline
  def apply(body: String, comment_id: Double, owner: String, repo: String): PullsUpdateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[PullsUpdateCommentParams]
  }
}

