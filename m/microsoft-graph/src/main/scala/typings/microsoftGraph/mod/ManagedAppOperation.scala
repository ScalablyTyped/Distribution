package typings.microsoftGraph.mod

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
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppOperation]
  }
}

