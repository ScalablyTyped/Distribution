package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetReviewResponseLinks extends js.Object {
  var html: PullsGetReviewResponseLinksHtml
  var pull_request: PullsGetReviewResponseLinksPullRequest
}

object PullsGetReviewResponseLinks {
  @scala.inline
  def apply(html: PullsGetReviewResponseLinksHtml, pull_request: PullsGetReviewResponseLinksPullRequest): PullsGetReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsGetReviewResponseLinks]
  }
}

