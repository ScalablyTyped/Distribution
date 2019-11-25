package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCategory extends Entity {
  // Optional description for the device category.
  var description: js.UndefOr[String] = js.undefined
  // Display name for the device category.
  var displayName: js.UndefOr[String] = js.undefined
}

object DeviceCategory {
  @scala.inline
  def apply(description: String = null, displayName: String = null, id: String = null): DeviceCategory = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCategory]
  }
}

