package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyParamsDeprecatedNumber extends js.Object {
  /**
    * The text of the comment.
    */
  var body: String
  /**
    * The comment ID to reply to. **Note**: This must be the ID of a _top-level comment_, not a reply to that comment. Replies to replies are not supported.
    */
  var in_reply_to: Double
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object PullsCreateCommentReplyParamsDeprecatedNumber {
  @scala.inline
  def apply(body: String, in_reply_to: Double, number: Double, owner: String, repo: String): PullsCreateCommentReplyParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(body = body, in_reply_to = in_reply_to, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[PullsCreateCommentReplyParamsDeprecatedNumber]
  }
}

