package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionNameParentteamid extends js.Object {
  var description: AnonType
  var name: AnonRequired
  var parent_team_id: AnonType
  var permission: AnonEnum
  var privacy: AnonEnum
  var team_id: AnonRequired
}

object AnonDescriptionNameParentteamid {
  @scala.inline
  def apply(
    description: AnonType,
    name: AnonRequired,
    parent_team_id: AnonType,
    permission: AnonEnum,
    privacy: AnonEnum,
    team_id: AnonRequired
  ): AnonDescriptionNameParentteamid = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescriptionNameParentteamid]
  }
}

