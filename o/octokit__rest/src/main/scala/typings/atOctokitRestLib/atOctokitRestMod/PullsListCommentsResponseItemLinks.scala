package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommentsResponseItemLinks extends js.Object {
  var html: PullsListCommentsResponseItemLinksHtml
  var pull_request: PullsListCommentsResponseItemLinksPullRequest
  var self: PullsListCommentsResponseItemLinksSelf
}

object PullsListCommentsResponseItemLinks {
  @scala.inline
  def apply(
    html: PullsListCommentsResponseItemLinksHtml,
    pull_request: PullsListCommentsResponseItemLinksPullRequest,
    self: PullsListCommentsResponseItemLinksSelf
  ): PullsListCommentsResponseItemLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request, self = self)
  
    __obj.asInstanceOf[PullsListCommentsResponseItemLinks]
  }
}

