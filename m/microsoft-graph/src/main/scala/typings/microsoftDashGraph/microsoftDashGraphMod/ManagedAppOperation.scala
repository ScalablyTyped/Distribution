package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppOperation extends Entity {
  // The operation name.
  var displayName: js.UndefOr[String] = js.undefined
  // The last time the app operation was modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // The current state of the operation
  var state: js.UndefOr[String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[String] = js.undefined
}

object ManagedAppOperation {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    state: String = null,
    version: String = null
  ): ManagedAppOperation = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppOperation]
  }
}

