package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactFolder extends Entity {
  /** The collection of child folders in the folder. Navigation property. Read-only. Nullable. */
  var childFolders: js.UndefOr[js.Array[ContactFolder]] = js.undefined
  /** The contacts in the folder. Navigation property. Read-only. Nullable. */
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
  /** The folder's display name. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable. */
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  /** The ID of the folder's parent folder. */
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable. */
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
}

object ContactFolder {
  @scala.inline
  def apply(
    childFolders: js.Array[ContactFolder] = null,
    contacts: js.Array[Contact] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: java.lang.String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null
  ): ContactFolder = {
    val __obj = js.Dynamic.literal()
    if (childFolders != null) __obj.updateDynamic("childFolders")(childFolders)
    if (contacts != null) __obj.updateDynamic("contacts")(contacts)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    __obj.asInstanceOf[ContactFolder]
  }
}

