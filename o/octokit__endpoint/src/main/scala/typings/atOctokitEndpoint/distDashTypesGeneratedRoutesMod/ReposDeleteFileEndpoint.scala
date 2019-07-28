package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var `author.email`: js.UndefOr[String] = js.undefined
  var `author.name`: js.UndefOr[String] = js.undefined
  var branch: js.UndefOr[String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var `committer.email`: js.UndefOr[String] = js.undefined
  var `committer.name`: js.UndefOr[String] = js.undefined
  var message: String
  var owner: String
  var path: String
  var repo: String
  var sha: String
}

object ReposDeleteFileEndpoint {
  @scala.inline
  def apply(
    message: String,
    owner: String,
    path: String,
    repo: String,
    sha: String,
    author: js.Object = null,
    `author.email`: String = null,
    `author.name`: String = null,
    branch: String = null,
    committer: js.Object = null,
    `committer.email`: String = null,
    `committer.name`: String = null
  ): ReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, path = path, repo = repo, sha = sha)
    if (author != null) __obj.updateDynamic("author")(author)
    if (`author.email` != null) __obj.updateDynamic("author.email")(`author.email`)
    if (`author.name` != null) __obj.updateDynamic("author.name")(`author.name`)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (`committer.email` != null) __obj.updateDynamic("committer.email")(`committer.email`)
    if (`committer.name` != null) __obj.updateDynamic("committer.name")(`committer.name`)
    __obj.asInstanceOf[ReposDeleteFileEndpoint]
  }
}

