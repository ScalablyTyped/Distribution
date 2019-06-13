package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppOperation extends Entity {
  /** The operation name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the app operation was modified. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The current state of the operation */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the entity. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAppOperation {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    state: java.lang.String = null,
    version: java.lang.String = null
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

