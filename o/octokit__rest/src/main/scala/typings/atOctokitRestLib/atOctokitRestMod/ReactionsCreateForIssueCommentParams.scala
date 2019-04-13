package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueCommentParams extends js.Object {
  var comment_id: scala.Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue comment.
    */
  var content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReactionsCreateForIssueCommentParams {
  @scala.inline
  def apply(
    comment_id: scala.Double,
    content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray,
    owner: java.lang.String,
    repo: java.lang.String
  ): ReactionsCreateForIssueCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id, content = content.asInstanceOf[js.Any], owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReactionsCreateForIssueCommentParams]
  }
}

