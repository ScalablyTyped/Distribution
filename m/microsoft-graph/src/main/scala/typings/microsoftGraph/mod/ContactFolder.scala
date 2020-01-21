package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactFolder extends Entity {
  // The collection of child folders in the folder. Navigation property. Read-only. Nullable.
  var childFolders: js.UndefOr[js.Array[ContactFolder]] = js.undefined
  // The contacts in the folder. Navigation property. Read-only. Nullable.
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
  // The folder's display name.
  var displayName: js.UndefOr[String] = js.undefined
  // The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // The ID of the folder's parent folder.
  var parentFolderId: js.UndefOr[String] = js.undefined
  // The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
}

object ContactFolder {
  @scala.inline
  def apply(
    childFolders: js.Array[ContactFolder] = null,
    contacts: js.Array[Contact] = null,
    displayName: String = null,
    id: String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null
  ): ContactFolder = {
    val __obj = js.Dynamic.literal()
    if (childFolders != null) __obj.updateDynamic("childFolders")(childFolders.asInstanceOf[js.Any])
    if (contacts != null) __obj.updateDynamic("contacts")(contacts.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactFolder]
  }
}

