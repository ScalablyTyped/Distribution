package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.`+1`
import typings.atOctokitRest.atOctokitRestStrings.`-1`
import typings.atOctokitRest.atOctokitRestStrings.confused
import typings.atOctokitRest.atOctokitRestStrings.eyes
import typings.atOctokitRest.atOctokitRestStrings.heart
import typings.atOctokitRest.atOctokitRestStrings.hooray
import typings.atOctokitRest.atOctokitRestStrings.laugh
import typings.atOctokitRest.atOctokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForCommitCommentParams extends js.Object {
  var comment_id: Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the commit comment.
    */
  var content: `+1` | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var owner: String
  var repo: String
}

object ReactionsCreateForCommitCommentParams {
  @scala.inline
  def apply(
    comment_id: Double,
    content: `+1` | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    owner: String,
    repo: String
  ): ReactionsCreateForCommitCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForCommitCommentParams]
  }
}

