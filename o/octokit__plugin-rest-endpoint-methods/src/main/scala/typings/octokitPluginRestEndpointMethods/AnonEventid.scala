package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventid extends js.Object {
  var event_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonEventid {
  @scala.inline
  def apply(event_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonEventid = {
    val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventid]
  }
}

