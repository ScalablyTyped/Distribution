package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyid extends js.Object {
  var key_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonKeyid {
  @scala.inline
  def apply(key_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonKeyid = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyid]
  }
}

