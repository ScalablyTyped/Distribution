package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParamsDeprecatedSha extends js.Object {
  var owner: String
  var repo: String
  /**
    * @deprecated "sha" parameter renamed to "ref"
    */
  var sha: String
}

object ReposGetCommitParamsDeprecatedSha {
  @scala.inline
  def apply(owner: String, repo: String, sha: String): ReposGetCommitParamsDeprecatedSha = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, sha = sha)
  
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedSha]
  }
}

