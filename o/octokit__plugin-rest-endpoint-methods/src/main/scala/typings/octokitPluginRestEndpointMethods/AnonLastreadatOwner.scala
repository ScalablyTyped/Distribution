package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastreadatOwner extends js.Object {
  var last_read_at: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonLastreadatOwner {
  @scala.inline
  def apply(last_read_at: AnonType, owner: AnonRequired, repo: AnonRequired): AnonLastreadatOwner = {
    val __obj = js.Dynamic.literal(last_read_at = last_read_at.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastreadatOwner]
  }
}

