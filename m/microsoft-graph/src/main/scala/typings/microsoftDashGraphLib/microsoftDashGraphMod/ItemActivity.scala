package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActivity extends Entity {
  var access: js.UndefOr[AccessAction] = js.undefined
  var activityDateTime: js.UndefOr[java.lang.String] = js.undefined
  var actor: js.UndefOr[IdentitySet] = js.undefined
  var driveItem: js.UndefOr[DriveItem] = js.undefined
}

object ItemActivity {
  @scala.inline
  def apply(
    access: AccessAction = null,
    activityDateTime: java.lang.String = null,
    actor: IdentitySet = null,
    driveItem: DriveItem = null,
    id: java.lang.String = null
  ): ItemActivity = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (activityDateTime != null) __obj.updateDynamic("activityDateTime")(activityDateTime)
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ItemActivity]
  }
}

