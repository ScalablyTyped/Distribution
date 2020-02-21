package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorOwner extends js.Object {
  var author: AnonType
  var owner: AnonRequired
  var page: AnonType
  var path: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var sha: AnonType
  var since: AnonType
  var until: AnonType
}

object AnonAuthorOwner {
  @scala.inline
  def apply(
    author: AnonType,
    owner: AnonRequired,
    page: AnonType,
    path: AnonType,
    per_page: AnonType,
    repo: AnonRequired,
    sha: AnonType,
    since: AnonType,
    until: AnonType
  ): AnonAuthorOwner = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthorOwner]
  }
}

