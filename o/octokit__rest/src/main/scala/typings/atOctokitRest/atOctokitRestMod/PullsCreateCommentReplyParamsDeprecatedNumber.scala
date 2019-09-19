package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyParamsDeprecatedNumber extends js.Object {
  /**
    * The text of the review comment.
    */
  var body: String
  /**
    * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.
    */
  var commit_id: String
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  /**
    * The relative path to the file that necessitates a comment.
    */
  var path: String
  /**
    * The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note below.
    */
  var position: Double
  var repo: String
}

object PullsCreateCommentReplyParamsDeprecatedNumber {
  @scala.inline
  def apply(
    body: String,
    commit_id: String,
    number: Double,
    owner: String,
    path: String,
    position: Double,
    repo: String
  ): PullsCreateCommentReplyParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, number = number, owner = owner, path = path, position = position, repo = repo)
  
    __obj.asInstanceOf[PullsCreateCommentReplyParamsDeprecatedNumber]
  }
}

