package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceCategory extends Entity {
  // Optional description for the device category.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // Display name for the device category.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceCategory {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null
  ): DeviceCategory = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DeviceCategory]
  }
}

