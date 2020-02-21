package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorAuthoremail extends js.Object {
  var author: AnonType
  @JSName("author.email")
  var authorDotemail: AnonRequired
  @JSName("author.name")
  var authorDotname: AnonRequired
  var branch: AnonType
  var committer: AnonType
  @JSName("committer.email")
  var committerDotemail: AnonRequired
  @JSName("committer.name")
  var committerDotname: AnonRequired
  var content: AnonRequired
  var message: AnonRequired
  var owner: AnonRequired
  var path: AnonRequired
  var repo: AnonRequired
  var sha: AnonType
}

object AnonAuthorAuthoremail {
  @scala.inline
  def apply(
    author: AnonType,
    authorDotemail: AnonRequired,
    authorDotname: AnonRequired,
    branch: AnonType,
    committer: AnonType,
    committerDotemail: AnonRequired,
    committerDotname: AnonRequired,
    content: AnonRequired,
    message: AnonRequired,
    owner: AnonRequired,
    path: AnonRequired,
    repo: AnonRequired,
    sha: AnonType
  ): AnonAuthorAuthoremail = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorAuthoremail]
  }
}

