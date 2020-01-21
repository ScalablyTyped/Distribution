package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActivity extends Entity {
  // An item was accessed.
  var access: js.UndefOr[AccessAction] = js.undefined
  // Details about when the activity took place. Read-only.
  var activityDateTime: js.UndefOr[String] = js.undefined
  // Identity of who performed the action. Read-only.
  var actor: js.UndefOr[IdentitySet] = js.undefined
  // Exposes the driveItem that was the target of this activity.
  var driveItem: js.UndefOr[DriveItem] = js.undefined
}

object ItemActivity {
  @scala.inline
  def apply(
    access: AccessAction = null,
    activityDateTime: String = null,
    actor: IdentitySet = null,
    driveItem: DriveItem = null,
    id: String = null
  ): ItemActivity = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (activityDateTime != null) __obj.updateDynamic("activityDateTime")(activityDateTime.asInstanceOf[js.Any])
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemActivity]
  }
}

