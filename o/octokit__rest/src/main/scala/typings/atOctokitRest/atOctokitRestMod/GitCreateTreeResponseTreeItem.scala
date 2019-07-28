package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeResponseTreeItem extends js.Object {
  var mode: String
  var path: String
  var sha: String
  var size: Double
  var `type`: String
  var url: String
}

object GitCreateTreeResponseTreeItem {
  @scala.inline
  def apply(mode: String, path: String, sha: String, size: Double, `type`: String, url: String): GitCreateTreeResponseTreeItem = {
    val __obj = js.Dynamic.literal(mode = mode, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitCreateTreeResponseTreeItem]
  }
}

