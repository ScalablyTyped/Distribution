package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request)
  
    __obj.asInstanceOf[PullsSubmitReviewResponseLinks]
  }
}

