package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponseCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposUpdateFileResponseCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposUpdateFileResponseCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateFileResponseCommitTree]
  }
}

