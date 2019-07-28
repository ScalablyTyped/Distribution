package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request, self = self)
  
    __obj.asInstanceOf[PullsGetCommentResponseLinks]
  }
}

