package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposDeleteFileResponseCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposDeleteFileResponseCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommitTree]
  }
}

