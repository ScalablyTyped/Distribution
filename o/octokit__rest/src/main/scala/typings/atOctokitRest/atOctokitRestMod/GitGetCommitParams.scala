package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitParams extends js.Object {
  var commit_sha: String
  var owner: String
  var repo: String
}

object GitGetCommitParams {
  @scala.inline
  def apply(commit_sha: String, owner: String, repo: String): GitGetCommitParams = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[GitGetCommitParams]
  }
}

