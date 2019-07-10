package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParamsDeprecatedSha extends js.Object {
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
  /**
    * @deprecated "sha" parameter renamed to "ref"
    */
  var sha: js.UndefOr[ReposGetCommitParamsDeprecatedSha] = js.undefined
}

object ReposGetCommitParamsDeprecatedSha {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    sha: ReposGetCommitParamsDeprecatedSha = null
  ): ReposGetCommitParamsDeprecatedSha = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposGetCommitParamsDeprecatedSha]
  }
}

