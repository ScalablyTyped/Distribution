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
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedSha]
  }
}

