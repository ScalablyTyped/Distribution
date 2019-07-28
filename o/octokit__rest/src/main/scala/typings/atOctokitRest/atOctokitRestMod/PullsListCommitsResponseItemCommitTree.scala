package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommitsResponseItemCommitTree extends js.Object {
  var sha: String
  var url: String
}

object PullsListCommitsResponseItemCommitTree {
  @scala.inline
  def apply(sha: String, url: String): PullsListCommitsResponseItemCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[PullsListCommitsResponseItemCommitTree]
  }
}

