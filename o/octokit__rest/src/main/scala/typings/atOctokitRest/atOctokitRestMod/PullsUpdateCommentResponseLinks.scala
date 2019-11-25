package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateCommentResponseLinks extends js.Object {
  var html: PullsUpdateCommentResponseLinksHtml
  var pull_request: PullsUpdateCommentResponseLinksPullRequest
  var self: PullsUpdateCommentResponseLinksSelf
}

object PullsUpdateCommentResponseLinks {
  @scala.inline
  def apply(
    html: PullsUpdateCommentResponseLinksHtml,
    pull_request: PullsUpdateCommentResponseLinksPullRequest,
    self: PullsUpdateCommentResponseLinksSelf
  ): PullsUpdateCommentResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateCommentResponseLinks]
  }
}

