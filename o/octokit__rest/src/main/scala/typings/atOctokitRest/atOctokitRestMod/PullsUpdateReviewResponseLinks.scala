package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateReviewResponseLinks extends js.Object {
  var html: PullsUpdateReviewResponseLinksHtml
  var pull_request: PullsUpdateReviewResponseLinksPullRequest
}

object PullsUpdateReviewResponseLinks {
  @scala.inline
  def apply(html: PullsUpdateReviewResponseLinksHtml, pull_request: PullsUpdateReviewResponseLinksPullRequest): PullsUpdateReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateReviewResponseLinks]
  }
}

