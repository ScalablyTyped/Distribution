package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetCommentResponseLinks extends js.Object {
  var html: PullsGetCommentResponseLinksHtml
  var pull_request: PullsGetCommentResponseLinksPullRequest
  var self: PullsGetCommentResponseLinksSelf
}

object PullsGetCommentResponseLinks {
  @scala.inline
  def apply(
    html: PullsGetCommentResponseLinksHtml,
    pull_request: PullsGetCommentResponseLinksPullRequest,
    self: PullsGetCommentResponseLinksSelf
  ): PullsGetCommentResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsGetCommentResponseLinks]
  }
}

