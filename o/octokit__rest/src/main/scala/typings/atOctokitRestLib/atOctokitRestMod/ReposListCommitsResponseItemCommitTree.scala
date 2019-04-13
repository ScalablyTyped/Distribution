package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItemCommitTree extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposListCommitsResponseItemCommitTree {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): ReposListCommitsResponseItemCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposListCommitsResponseItemCommitTree]
  }
}

