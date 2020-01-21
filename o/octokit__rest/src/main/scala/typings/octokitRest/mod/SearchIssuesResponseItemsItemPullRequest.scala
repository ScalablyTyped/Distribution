package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesResponseItemsItemPullRequest extends js.Object {
  var diff_url: Null
  var html_url: Null
  var patch_url: Null
}

object SearchIssuesResponseItemsItemPullRequest {
  @scala.inline
  def apply(diff_url: Null, html_url: Null, patch_url: Null): SearchIssuesResponseItemsItemPullRequest = {
    val __obj = js.Dynamic.literal(diff_url = diff_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIssuesResponseItemsItemPullRequest]
  }
}

