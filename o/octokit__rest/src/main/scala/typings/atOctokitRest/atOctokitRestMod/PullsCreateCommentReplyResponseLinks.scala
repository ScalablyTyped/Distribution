package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateCommentReplyResponseLinks extends js.Object {
  var html: PullsCreateCommentReplyResponseLinksHtml
  var pull_request: PullsCreateCommentReplyResponseLinksPullRequest
  var self: PullsCreateCommentReplyResponseLinksSelf
}

object PullsCreateCommentReplyResponseLinks {
  @scala.inline
  def apply(
    html: PullsCreateCommentReplyResponseLinksHtml,
    pull_request: PullsCreateCommentReplyResponseLinksPullRequest,
    self: PullsCreateCommentReplyResponseLinksSelf
  ): PullsCreateCommentReplyResponseLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateCommentReplyResponseLinks]
  }
}

