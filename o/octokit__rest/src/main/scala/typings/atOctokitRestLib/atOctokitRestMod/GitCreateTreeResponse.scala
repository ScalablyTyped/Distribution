package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTreeResponse extends js.Object {
  var sha: java.lang.String
  var tree: js.Array[GitCreateTreeResponseTreeItem]
  var url: java.lang.String
}

object GitCreateTreeResponse {
  @scala.inline
  def apply(sha: java.lang.String, tree: js.Array[GitCreateTreeResponseTreeItem], url: java.lang.String): GitCreateTreeResponse = {
    val __obj = js.Dynamic.literal(sha = sha, tree = tree, url = url)
  
    __obj.asInstanceOf[GitCreateTreeResponse]
  }
}

