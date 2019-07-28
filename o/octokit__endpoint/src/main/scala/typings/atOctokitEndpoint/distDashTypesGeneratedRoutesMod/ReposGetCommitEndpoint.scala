package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitEndpoint extends js.Object {
  var commit_sha: js.UndefOr[String] = js.undefined
  var owner: String
  var ref: String
  var repo: String
  var sha: js.UndefOr[String] = js.undefined
}

object ReposGetCommitEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, commit_sha: String = null, sha: String = null): ReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
    if (commit_sha != null) __obj.updateDynamic("commit_sha")(commit_sha)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposGetCommitEndpoint]
  }
}

