package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommitTree]
  }
}

