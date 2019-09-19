package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateReviewCommentReplyResponseLinks extends js.Object {
  var html: PullsCreateReviewCommentReplyResponseLinksHtml
  var pull_request: PullsCreateReviewCommentReplyResponseLinksPullRequest
  var self: PullsCreateReviewCommentReplyResponseLinksSelf
}

object PullsCreateReviewCommentReplyResponseLinks {
  @scala.inline
  def apply(
    html: PullsCreateReviewCommentReplyResponseLinksHtml,
    pull_request: PullsCreateReviewCommentReplyResponseLinksPullRequest,
    self: PullsCreateReviewCommentReplyResponseLinksSelf
  ): PullsCreateReviewCommentReplyResponseLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request, self = self)
  
    __obj.asInstanceOf[PullsCreateReviewCommentReplyResponseLinks]
  }
}

