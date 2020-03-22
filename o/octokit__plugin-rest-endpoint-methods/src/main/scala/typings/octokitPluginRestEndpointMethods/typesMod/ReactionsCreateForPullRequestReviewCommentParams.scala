package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.Plussign1
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`-1`
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.confused
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.eyes
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.heart
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.hooray
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.laugh
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForPullRequestReviewCommentParams extends js.Object {
  var comment_id: Double
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the pull request review comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var owner: String
  var repo: String
}

object ReactionsCreateForPullRequestReviewCommentParams {
  @scala.inline
  def apply(
    comment_id: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    owner: String,
    repo: String
  ): ReactionsCreateForPullRequestReviewCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForPullRequestReviewCommentParams]
  }
}

