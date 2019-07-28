package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetCommentsForReviewResponseItemLinks extends js.Object {
  var html: PullsGetCommentsForReviewResponseItemLinksHtml
  var pull_request: PullsGetCommentsForReviewResponseItemLinksPullRequest
  var self: PullsGetCommentsForReviewResponseItemLinksSelf
}

object PullsGetCommentsForReviewResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsGetCommentsForReviewResponseItemLinksHtml,
    pull_request: PullsGetCommentsForReviewResponseItemLinksPullRequest,
    self: PullsGetCommentsForReviewResponseItemLinksSelf
  ): PullsGetCommentsForReviewResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request, self = self)
  
    __obj.asInstanceOf[PullsGetCommentsForReviewResponseItemLinks]
  }
}

