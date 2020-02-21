package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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

trait ReactionsListForPullRequestReviewCommentParams extends js.Object {
  var comment_id: Double
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to a pull request review comment.
    */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.undefined
  var owner: String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var repo: String
}

object ReactionsListForPullRequestReviewCommentParams {
  @scala.inline
  def apply(
    comment_id: Double,
    owner: String,
    repo: String,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = null,
    page: Int | Double = null,
    per_page: Int | Double = null
  ): ReactionsListForPullRequestReviewCommentParams = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForPullRequestReviewCommentParams]
  }
}

