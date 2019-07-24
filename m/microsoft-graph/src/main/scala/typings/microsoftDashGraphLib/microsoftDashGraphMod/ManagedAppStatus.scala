package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppStatus extends Entity {
  // Friendly name of the status report.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAppStatus {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    version: java.lang.String = null
  ): ManagedAppStatus = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppStatus]
  }
}

