package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCommitsResponseItemsItemParentsItem extends js.Object {
  var html_url: String
  var sha: String
  var url: String
}

object SearchCommitsResponseItemsItemParentsItem {
  @scala.inline
  def apply(html_url: String, sha: String, url: String): SearchCommitsResponseItemsItemParentsItem = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchCommitsResponseItemsItemParentsItem]
  }
}

