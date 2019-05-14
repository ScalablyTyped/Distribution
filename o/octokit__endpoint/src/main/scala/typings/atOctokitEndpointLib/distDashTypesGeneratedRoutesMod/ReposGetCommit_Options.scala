package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommit_Options extends js.Object {
  var commit_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object ReposGetCommit_Options {
  @scala.inline
  def apply(
    commit_sha: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String = null
  ): ReposGetCommit_Options = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposGetCommit_Options]
  }
}

