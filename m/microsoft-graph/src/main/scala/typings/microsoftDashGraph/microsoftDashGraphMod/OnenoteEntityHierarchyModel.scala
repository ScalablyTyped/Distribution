package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteEntityHierarchyModel extends OnenoteEntitySchemaObjectModel {
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // The name of the notebook.
  var displayName: js.UndefOr[String] = js.undefined
  // Identity of the user, device, and application which created the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
}

object OnenoteEntityHierarchyModel {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdDateTime: String = null,
    displayName: String = null,
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    self: String = null
  ): OnenoteEntityHierarchyModel = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (self != null) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[OnenoteEntityHierarchyModel]
  }
}

