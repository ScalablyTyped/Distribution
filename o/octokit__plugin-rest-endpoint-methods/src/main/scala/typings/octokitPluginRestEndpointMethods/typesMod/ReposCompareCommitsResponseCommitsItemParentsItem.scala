package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseCommitsItemParentsItem extends js.Object {
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseCommitsItemParentsItem {
  @scala.inline
  def apply(sha: String, url: String): ReposCompareCommitsResponseCommitsItemParentsItem = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseCommitsItemParentsItem]
  }
}

