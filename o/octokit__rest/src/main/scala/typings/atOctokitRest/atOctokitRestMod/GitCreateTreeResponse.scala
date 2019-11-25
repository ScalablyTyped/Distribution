package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeResponse extends js.Object {
  var sha: String
  var tree: js.Array[GitCreateTreeResponseTreeItem]
  var url: String
}

object GitCreateTreeResponse {
  @scala.inline
  def apply(sha: String, tree: js.Array[GitCreateTreeResponseTreeItem], url: String): GitCreateTreeResponse = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitCreateTreeResponse]
  }
}

