package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthor extends js.Object {
  var author: AnonType
  @JSName("author.date")
  var authorDotdate: AnonType
  @JSName("author.email")
  var authorDotemail: AnonType
  @JSName("author.name")
  var authorDotname: AnonType
  var committer: AnonType
  @JSName("committer.date")
  var committerDotdate: AnonType
  @JSName("committer.email")
  var committerDotemail: AnonType
  @JSName("committer.name")
  var committerDotname: AnonType
  var message: AnonRequired
  var owner: AnonRequired
  var parents: AnonRequired
  var repo: AnonRequired
  var signature: AnonType
  var tree: AnonRequired
}

object AnonAuthor {
  @scala.inline
  def apply(
    author: AnonType,
    authorDotdate: AnonType,
    authorDotemail: AnonType,
    authorDotname: AnonType,
    committer: AnonType,
    committerDotdate: AnonType,
    committerDotemail: AnonType,
    committerDotname: AnonType,
    message: AnonRequired,
    owner: AnonRequired,
    parents: AnonRequired,
    repo: AnonRequired,
    signature: AnonType,
    tree: AnonRequired
  ): AnonAuthor = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("author.date")(authorDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.date")(committerDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthor]
  }
}

