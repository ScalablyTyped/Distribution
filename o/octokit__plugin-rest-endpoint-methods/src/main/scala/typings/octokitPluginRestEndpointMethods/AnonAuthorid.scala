package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorid extends js.Object {
  var author_id: AnonRequired
  var email: AnonType
  var name: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonAuthorid {
  @scala.inline
  def apply(author_id: AnonRequired, email: AnonType, name: AnonType, owner: AnonRequired, repo: AnonRequired): AnonAuthorid = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthorid]
  }
}

