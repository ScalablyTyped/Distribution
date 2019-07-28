package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryRoleTemplate extends DirectoryObject {
  // The description to set for the directory role. Read-only.
  var description: js.UndefOr[String] = js.undefined
  // The display name to set for the directory role. Read-only.
  var displayName: js.UndefOr[String] = js.undefined
}

object DirectoryRoleTemplate {
  @scala.inline
  def apply(
    deletedDateTime: String = null,
    description: String = null,
    displayName: String = null,
    id: String = null
  ): DirectoryRoleTemplate = {
    val __obj = js.Dynamic.literal()
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DirectoryRoleTemplate]
  }
}

