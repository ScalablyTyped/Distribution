package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilesha extends js.Object {
  var file_sha: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonFilesha {
  @scala.inline
  def apply(file_sha: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonFilesha = {
    val __obj = js.Dynamic.literal(file_sha = file_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilesha]
  }
}

