package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewowner extends js.Object {
  var new_owner: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var team_ids: AnonType
}

object AnonNewowner {
  @scala.inline
  def apply(new_owner: AnonType, owner: AnonRequired, repo: AnonRequired, team_ids: AnonType): AnonNewowner = {
    val __obj = js.Dynamic.literal(new_owner = new_owner.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_ids = team_ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewowner]
  }
}

