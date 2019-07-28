package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitResponseTree extends js.Object {
  var sha: String
  var url: String
}

object GitGetCommitResponseTree {
  @scala.inline
  def apply(sha: String, url: String): GitGetCommitResponseTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[GitGetCommitResponseTree]
  }
}

