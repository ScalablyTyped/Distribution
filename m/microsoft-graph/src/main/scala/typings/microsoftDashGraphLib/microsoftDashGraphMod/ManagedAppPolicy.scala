package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppPolicy extends Entity {
  /** The date and time the policy was created. */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The policy's description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Policy display name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Last time the policy was modified. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the entity. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAppPolicy {
  @scala.inline
  def apply(
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    version: java.lang.String = null
  ): ManagedAppPolicy = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppPolicy]
  }
}

