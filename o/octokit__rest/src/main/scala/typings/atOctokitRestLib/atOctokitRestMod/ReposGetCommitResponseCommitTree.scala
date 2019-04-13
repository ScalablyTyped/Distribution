package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseCommitTree extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposGetCommitResponseCommitTree {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): ReposGetCommitResponseCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposGetCommitResponseCommitTree]
  }
}

