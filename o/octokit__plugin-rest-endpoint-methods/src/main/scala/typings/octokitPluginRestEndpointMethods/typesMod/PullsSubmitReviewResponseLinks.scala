package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsSubmitReviewResponseLinks extends js.Object {
  var html: PullsSubmitReviewResponseLinksHtml
  var pull_request: PullsSubmitReviewResponseLinksPullRequest
}

object PullsSubmitReviewResponseLinks {
  @scala.inline
  def apply(html: PullsSubmitReviewResponseLinksHtml, pull_request: PullsSubmitReviewResponseLinksPullRequest): PullsSubmitReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsSubmitReviewResponseLinks]
  }
}

