package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeResponseData extends js.Object {
  var sha: String
  var tree: js.Array[Mode]
  var url: String
}

object GitCreateTreeResponseData {
  @scala.inline
  def apply(sha: String, tree: js.Array[Mode], url: String): GitCreateTreeResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeResponseData]
  }
}

