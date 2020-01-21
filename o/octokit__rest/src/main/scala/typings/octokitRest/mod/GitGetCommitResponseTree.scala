package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitGetCommitResponseTree]
  }
}

