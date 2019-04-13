package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeResponseTreeItem extends js.Object {
  var mode: java.lang.String
  var path: java.lang.String
  var sha: java.lang.String
  var size: scala.Double
  var `type`: java.lang.String
  var url: java.lang.String
}

object GitCreateTreeResponseTreeItem {
  @scala.inline
  def apply(
    mode: java.lang.String,
    path: java.lang.String,
    sha: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    url: java.lang.String
  ): GitCreateTreeResponseTreeItem = {
    val __obj = js.Dynamic.literal(mode = mode, path = path, sha = sha, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GitCreateTreeResponseTreeItem]
  }
}

