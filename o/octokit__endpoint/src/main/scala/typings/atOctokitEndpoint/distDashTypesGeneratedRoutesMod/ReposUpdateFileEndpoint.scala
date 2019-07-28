package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var `author.email`: String
  var `author.name`: String
  var branch: js.UndefOr[String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var `committer.email`: String
  var `committer.name`: String
  var content: String
  var message: String
  var owner: String
  var path: String
  var repo: String
  var sha: js.UndefOr[String] = js.undefined
}

object ReposUpdateFileEndpoint {
  @scala.inline
  def apply(
    `author.email`: String,
    `author.name`: String,
    `committer.email`: String,
    `committer.name`: String,
    content: String,
    message: String,
    owner: String,
    path: String,
    repo: String,
    author: js.Object = null,
    branch: String = null,
    committer: js.Object = null,
    sha: String = null
  ): ReposUpdateFileEndpoint = {
    val __obj = js.Dynamic.literal(content = content, message = message, owner = owner, path = path, repo = repo)
    __obj.updateDynamic("author.email")(`author.email`)
    __obj.updateDynamic("author.name")(`author.name`)
    __obj.updateDynamic("committer.email")(`committer.email`)
    __obj.updateDynamic("committer.name")(`committer.name`)
    if (author != null) __obj.updateDynamic("author")(author)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposUpdateFileEndpoint]
  }
}

