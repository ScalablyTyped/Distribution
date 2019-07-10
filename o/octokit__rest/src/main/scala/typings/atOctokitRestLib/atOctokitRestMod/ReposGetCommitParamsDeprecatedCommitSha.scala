package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParamsDeprecatedCommitSha extends js.Object {
  /**
    * @deprecated "commit_sha" parameter renamed to "ref"
    */
  var commit_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetCommitParamsDeprecatedCommitSha {
  @scala.inline
  def apply(commit_sha: java.lang.String, owner: java.lang.String, repo: java.lang.String): ReposGetCommitParamsDeprecatedCommitSha = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedCommitSha]
  }
}

