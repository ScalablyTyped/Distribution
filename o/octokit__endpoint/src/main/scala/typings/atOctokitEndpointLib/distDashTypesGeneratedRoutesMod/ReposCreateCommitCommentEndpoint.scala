package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentEndpoint extends js.Object {
  var body: java.lang.String
  var commit_sha: java.lang.String
  var line: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateCommitCommentEndpoint {
  @scala.inline
  def apply(
    body: java.lang.String,
    commit_sha: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    line: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    sha: java.lang.String = null
  ): ReposCreateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, commit_sha = commit_sha, owner = owner, repo = repo)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposCreateCommitCommentEndpoint]
  }
}

