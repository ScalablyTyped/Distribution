package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitEndpoint extends js.Object {
  var commit_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object ReposGetCommitEndpoint {
  @scala.inline
  def apply(
    commit_sha: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String = null
  ): ReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposGetCommitEndpoint]
  }
}

