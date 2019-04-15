package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParamsDeprecatedSha extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * @deprecated "sha" parameter renamed to "commit_sha"
    */
  var sha: java.lang.String
}

object ReposGetCommitParamsDeprecatedSha {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, sha: java.lang.String): ReposGetCommitParamsDeprecatedSha = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedSha]
  }
}

