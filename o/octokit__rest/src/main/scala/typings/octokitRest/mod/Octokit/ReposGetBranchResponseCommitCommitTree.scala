package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposGetBranchResponseCommitCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposGetBranchResponseCommitCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommitTree]
  }
}

