package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeResponse extends js.Object {
  var sha: String
  var tree: js.Array[GitGetTreeResponseTreeItem]
  var truncated: Boolean
  var url: String
}

object GitGetTreeResponse {
  @scala.inline
  def apply(sha: String, tree: js.Array[GitGetTreeResponseTreeItem], truncated: Boolean, url: String): GitGetTreeResponse = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitGetTreeResponse]
  }
}

