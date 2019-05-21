package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var message: java.lang.String
  var owner: java.lang.String
  var path: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
}

object ReposDeleteFileEndpoint {
  @scala.inline
  def apply(
    message: java.lang.String,
    owner: java.lang.String,
    path: java.lang.String,
    repo: java.lang.String,
    sha: java.lang.String,
    author: js.Object = null,
    branch: java.lang.String = null,
    committer: js.Object = null
  ): ReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, path = path, repo = repo, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    __obj.asInstanceOf[ReposDeleteFileEndpoint]
  }
}

