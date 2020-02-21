package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewResponseLinks extends js.Object {
  var html: PullsCreateReviewResponseLinksHtml
  var pull_request: PullsCreateReviewResponseLinksPullRequest
}

object PullsCreateReviewResponseLinks {
  @scala.inline
  def apply(html: PullsCreateReviewResponseLinksHtml, pull_request: PullsCreateReviewResponseLinksPullRequest): PullsCreateReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateReviewResponseLinks]
  }
}

