package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommitParentsItem extends js.Object {
  var html_url: String
  var sha: String
  var url: String
}

object ReposDeleteFileResponseCommitParentsItem {
  @scala.inline
  def apply(html_url: String, sha: String, url: String): ReposDeleteFileResponseCommitParentsItem = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommitParentsItem]
  }
}

