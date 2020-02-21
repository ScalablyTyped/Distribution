package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionMaintainers extends js.Object {
  var description: AnonType
  var maintainers: AnonType
  var name: AnonRequired
  var org: AnonRequired
  var parent_team_id: AnonType
  var permission: AnonEnum
  var privacy: AnonEnum
  var repo_names: AnonType
}

object AnonDescriptionMaintainers {
  @scala.inline
  def apply(
    description: AnonType,
    maintainers: AnonType,
    name: AnonRequired,
    org: AnonRequired,
    parent_team_id: AnonType,
    permission: AnonEnum,
    privacy: AnonEnum,
    repo_names: AnonType
  ): AnonDescriptionMaintainers = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], parent_team_id = parent_team_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repo_names = repo_names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescriptionMaintainers]
  }
}

