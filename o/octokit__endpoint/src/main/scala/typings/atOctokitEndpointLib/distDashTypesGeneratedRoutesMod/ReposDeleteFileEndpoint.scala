package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var `author.email`: js.UndefOr[java.lang.String] = js.undefined
  var `author.name`: js.UndefOr[java.lang.String] = js.undefined
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var `committer.email`: js.UndefOr[java.lang.String] = js.undefined
  var `committer.name`: js.UndefOr[java.lang.String] = js.undefined
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
    `author.email`: java.lang.String = null,
    `author.name`: java.lang.String = null,
    branch: java.lang.String = null,
    committer: js.Object = null,
    `committer.email`: java.lang.String = null,
    `committer.name`: java.lang.String = null
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

