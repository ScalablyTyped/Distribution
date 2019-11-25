package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetResource extends js.Object {
  // Indicates the visible name defined for the resource. Typically specified when the resource is created.
  var displayName: js.UndefOr[String] = js.undefined
  // When type is set to Group, this indicates the group type.
  var groupType: js.UndefOr[GroupType] = js.undefined
  // Indicates the unique ID of the resource.
  var id: js.UndefOr[String] = js.undefined
  // Indicates name, old value and new value of each attribute that changed. Property values depend on the operation type.
  var modifiedProperties: js.UndefOr[js.Array[ModifiedProperty]] = js.undefined
  // Describes the resource type. Example values include Application, Group, ServicePrincipal, and User.
  var `type`: js.UndefOr[String] = js.undefined
  // When type is set to User, this includes the user name that initiated the action; null for other types.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}

object TargetResource {
  @scala.inline
  def apply(
    displayName: String = null,
    groupType: GroupType = null,
    id: String = null,
    modifiedProperties: js.Array[ModifiedProperty] = null,
    `type`: String = null,
    userPrincipalName: String = null
  ): TargetResource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifiedProperties != null) __obj.updateDynamic("modifiedProperties")(modifiedProperties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetResource]
  }
}

