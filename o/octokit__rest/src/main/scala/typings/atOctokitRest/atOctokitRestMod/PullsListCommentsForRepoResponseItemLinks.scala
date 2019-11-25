package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommentsForRepoResponseItemLinks extends js.Object {
  var html: PullsListCommentsForRepoResponseItemLinksHtml
  var pull_request: PullsListCommentsForRepoResponseItemLinksPullRequest
  var self: PullsListCommentsForRepoResponseItemLinksSelf
}

object PullsListCommentsForRepoResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsListCommentsForRepoResponseItemLinksHtml,
    pull_request: PullsListCommentsForRepoResponseItemLinksPullRequest,
    self: PullsListCommentsForRepoResponseItemLinksSelf
  ): PullsListCommentsForRepoResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsListCommentsForRepoResponseItemLinks]
  }
}

