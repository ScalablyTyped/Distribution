package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTreeResponseData extends js.Object {
  var sha: String
  var tree: js.Array[Mode]
  var truncated: Boolean
  var url: String
}

object GitGetTreeResponseData {
  @scala.inline
  def apply(sha: String, tree: js.Array[Mode], truncated: Boolean, url: String): GitGetTreeResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTreeResponseData]
  }
}

