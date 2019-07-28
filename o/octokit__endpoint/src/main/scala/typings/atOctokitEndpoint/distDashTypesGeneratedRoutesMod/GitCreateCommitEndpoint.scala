package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var `author.date`: js.UndefOr[String] = js.undefined
  var `author.email`: js.UndefOr[String] = js.undefined
  var `author.name`: js.UndefOr[String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var `committer.date`: js.UndefOr[String] = js.undefined
  var `committer.email`: js.UndefOr[String] = js.undefined
  var `committer.name`: js.UndefOr[String] = js.undefined
  var message: String
  var owner: String
  var parents: js.Array[String]
  var repo: String
  var signature: js.UndefOr[String] = js.undefined
  var tree: String
}

object GitCreateCommitEndpoint {
  @scala.inline
  def apply(
    message: String,
    owner: String,
    parents: js.Array[String],
    repo: String,
    tree: String,
    author: js.Object = null,
    `author.date`: String = null,
    `author.email`: String = null,
    `author.name`: String = null,
    committer: js.Object = null,
    `committer.date`: String = null,
    `committer.email`: String = null,
    `committer.name`: String = null,
    signature: String = null
  ): GitCreateCommitEndpoint = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, parents = parents, repo = repo, tree = tree)
    if (author != null) __obj.updateDynamic("author")(author)
    if (`author.date` != null) __obj.updateDynamic("author.date")(`author.date`)
    if (`author.email` != null) __obj.updateDynamic("author.email")(`author.email`)
    if (`author.name` != null) __obj.updateDynamic("author.name")(`author.name`)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (`committer.date` != null) __obj.updateDynamic("committer.date")(`committer.date`)
    if (`committer.email` != null) __obj.updateDynamic("committer.email")(`committer.email`)
    if (`committer.name` != null) __obj.updateDynamic("committer.name")(`committer.name`)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[GitCreateCommitEndpoint]
  }
}

