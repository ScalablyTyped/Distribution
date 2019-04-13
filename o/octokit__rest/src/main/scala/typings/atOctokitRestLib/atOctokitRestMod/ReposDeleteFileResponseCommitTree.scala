package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommitTree extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposDeleteFileResponseCommitTree {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): ReposDeleteFileResponseCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommitTree]
  }
}

