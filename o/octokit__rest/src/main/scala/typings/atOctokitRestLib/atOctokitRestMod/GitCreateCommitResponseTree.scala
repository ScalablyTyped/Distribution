package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitResponseTree extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object GitCreateCommitResponseTree {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): GitCreateCommitResponseTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[GitCreateCommitResponseTree]
  }
}

