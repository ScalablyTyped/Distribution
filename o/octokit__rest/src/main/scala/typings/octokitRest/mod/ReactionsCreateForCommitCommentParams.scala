package typings.octokitRest.mod

import typings.octokitRest.octokitRestStrings.Plussign1
import typings.octokitRest.octokitRestStrings.`-1`
import typings.octokitRest.octokitRestStrings.confused
import typings.octokitRest.octokitRestStrings.eyes
import typings.octokitRest.octokitRestStrings.heart
import typings.octokitRest.octokitRestStrings.hooray
import typings.octokitRest.octokitRestStrings.laugh
import typings.octokitRest.octokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForCommitCommentParams extends js.Object {
  var comment_id: Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the commit comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var owner: String
  var repo: String
}

object ReactionsCreateForCommitCommentParams {
  @scala.inline
  def apply(
    comment_id: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    owner: String,
    repo: String
  ): ReactionsCreateForCommitCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForCommitCommentParams]
  }
}

