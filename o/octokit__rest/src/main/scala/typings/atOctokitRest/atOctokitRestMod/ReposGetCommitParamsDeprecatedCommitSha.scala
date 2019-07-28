package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParamsDeprecatedCommitSha extends js.Object {
  /**
    * @deprecated "commit_sha" parameter renamed to "ref"
    */
  var commit_sha: String
  var owner: String
  var repo: String
}

object ReposGetCommitParamsDeprecatedCommitSha {
  @scala.inline
  def apply(commit_sha: String, owner: String, repo: String): ReposGetCommitParamsDeprecatedCommitSha = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedCommitSha]
  }
}

