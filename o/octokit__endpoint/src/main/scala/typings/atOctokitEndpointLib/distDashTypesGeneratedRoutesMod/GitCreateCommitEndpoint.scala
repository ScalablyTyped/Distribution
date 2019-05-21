package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var `author.date`: js.UndefOr[java.lang.String] = js.undefined
  var `author.email`: js.UndefOr[java.lang.String] = js.undefined
  var `author.name`: js.UndefOr[java.lang.String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var `committer.date`: js.UndefOr[java.lang.String] = js.undefined
  var `committer.email`: js.UndefOr[java.lang.String] = js.undefined
  var `committer.name`: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var owner: java.lang.String
  var parents: js.Array[java.lang.String]
  var repo: java.lang.String
  var signature: js.UndefOr[java.lang.String] = js.undefined
  var tree: java.lang.String
}

object GitCreateCommitEndpoint {
  @scala.inline
  def apply(
    message: java.lang.String,
    owner: java.lang.String,
    parents: js.Array[java.lang.String],
    repo: java.lang.String,
    tree: java.lang.String,
    author: js.Object = null,
    `author.date`: java.lang.String = null,
    `author.email`: java.lang.String = null,
    `author.name`: java.lang.String = null,
    committer: js.Object = null,
    `committer.date`: java.lang.String = null,
    `committer.email`: java.lang.String = null,
    `committer.name`: java.lang.String = null,
    signature: java.lang.String = null
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

