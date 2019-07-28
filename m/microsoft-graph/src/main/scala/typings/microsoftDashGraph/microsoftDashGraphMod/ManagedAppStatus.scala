package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppStatus extends Entity {
  // Friendly name of the status report.
  var displayName: js.UndefOr[String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[String] = js.undefined
}

object ManagedAppStatus {
  @scala.inline
  def apply(displayName: String = null, id: String = null, version: String = null): ManagedAppStatus = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppStatus]
  }
}

