package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeResponseTreeItem extends js.Object {
  var mode: String
  var path: String
  var sha: String
  var size: js.UndefOr[Double] = js.undefined
  var `type`: String
  var url: String
}

object GitGetTreeResponseTreeItem {
  @scala.inline
  def apply(mode: String, path: String, sha: String, `type`: String, url: String, size: Int | Double = null): GitGetTreeResponseTreeItem = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeResponseTreeItem]
  }
}

