package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListReviewsResponseItemLinks extends js.Object {
  var html: PullsListReviewsResponseItemLinksHtml
  var pull_request: PullsListReviewsResponseItemLinksPullRequest
}

object PullsListReviewsResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsListReviewsResponseItemLinksHtml,
    pull_request: PullsListReviewsResponseItemLinksPullRequest
  ): PullsListReviewsResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request)
  
    __obj.asInstanceOf[PullsListReviewsResponseItemLinks]
  }
}

