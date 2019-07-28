package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitResponseTree extends js.Object {
  var sha: String
  var url: String
}

object GitCreateCommitResponseTree {
  @scala.inline
  def apply(sha: String, url: String): GitCreateCommitResponseTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[GitCreateCommitResponseTree]
  }
}

