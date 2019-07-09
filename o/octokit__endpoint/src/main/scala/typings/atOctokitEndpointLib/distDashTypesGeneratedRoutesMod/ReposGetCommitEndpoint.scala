package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitEndpoint extends js.Object {
  var commit_sha: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object ReposGetCommitEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String,
    commit_sha: java.lang.String = null,
    sha: java.lang.String = null
  ): ReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (commit_sha != null) __obj.updateDynamic("commit_sha")(commit_sha)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposGetCommitEndpoint]
  }
}

