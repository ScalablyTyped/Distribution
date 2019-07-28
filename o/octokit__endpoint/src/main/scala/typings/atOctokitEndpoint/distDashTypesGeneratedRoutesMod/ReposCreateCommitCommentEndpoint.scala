package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitCommentEndpoint extends js.Object {
  var body: String
  var commit_sha: String
  var line: js.UndefOr[Double] = js.undefined
  var owner: String
  var path: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var repo: String
  var sha: js.UndefOr[String] = js.undefined
}

object ReposCreateCommitCommentEndpoint {
  @scala.inline
  def apply(
    body: String,
    commit_sha: String,
    owner: String,
    repo: String,
    line: Int | Double = null,
    path: String = null,
    position: Int | Double = null,
    sha: String = null
  ): ReposCreateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, commit_sha = commit_sha, owner = owner, repo = repo)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposCreateCommitCommentEndpoint]
  }
}

