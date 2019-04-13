package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentParams extends js.Object {
  /**
    * The text of the comment.
    */
  var body: java.lang.String
  /**
    * The SHA of the commit needing a comment. Not using the latest commit SHA may render your comment outdated if a subsequent commit modifies the line you specify as the `position`.
    */
  var commit_id: java.lang.String
  var number: scala.Double
  var owner: java.lang.String
  /**
    * The relative path to the file that necessitates a comment.
    */
  var path: java.lang.String
  /**
    * The position in the diff where you want to add a review comment. Note this value is not the same as the line number in the file. For help finding the position value, read the note below.
    */
  var position: scala.Double
  var repo: java.lang.String
}

object PullsCreateCommentParams {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_id: java.lang.String,
    number: scala.Double,
    owner: java.lang.String,
    path: java.lang.String,
    position: scala.Double,
    repo: java.lang.String
  ): PullsCreateCommentParams = {
    val __obj = js.Dynamic.literal(body = body, commit_id = commit_id, number = number, owner = owner, path = path, position = position, repo = repo)
  
    __obj.asInstanceOf[PullsCreateCommentParams]
  }
}

