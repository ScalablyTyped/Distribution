package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateCommitComment_Options extends js.Object {
  var body: java.lang.String
  var line: js.UndefOr[scala.Double] = js.undefined
  var owner: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  var sha: java.lang.String
}

object ReposCreateCommitComment_Options {
  @scala.inline
  def apply(
    body: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    line: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    position: scala.Int | scala.Double = null
  ): ReposCreateCommitComment_Options = {
    val __obj = js.Dynamic.literal(body = body, owner = owner, repo = repo, sha = sha)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitComment_Options]
  }
}

