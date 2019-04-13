package typings
package atOctokitRestLib.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request, self = self)
  
    __obj.asInstanceOf[PullsCreateCommentReplyResponseLinks]
  }
}

