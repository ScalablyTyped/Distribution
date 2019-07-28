package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParamsDeprecatedSha extends js.Object {
  var owner: String
  var ref: String
  var repo: String
  /**
    * @deprecated "sha" parameter renamed to "ref"
    */
  var sha: js.UndefOr[ReposGetCommitParamsDeprecatedSha] = js.undefined
}

object ReposGetCommitParamsDeprecatedSha {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, sha: ReposGetCommitParamsDeprecatedSha = null): ReposGetCommitParamsDeprecatedSha = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedSha]
  }
}

