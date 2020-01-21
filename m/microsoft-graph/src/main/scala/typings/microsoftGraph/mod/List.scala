package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends BaseItem {
  // The collection of field definitions for this list.
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  // The collection of content types present in this list.
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.undefined
  // The displayable title of the list.
  var displayName: js.UndefOr[String] = js.undefined
  // Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
  var drive: js.UndefOr[Drive] = js.undefined
  // All items contained in the list.
  var items: js.UndefOr[js.Array[ListItem]] = js.undefined
  // Provides additional details about the list.
  var list: js.UndefOr[ListInfo] = js.undefined
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  // If present, indicates that this is a system-managed list. Read-only.
  var system: js.UndefOr[SystemFacet] = js.undefined
}

object List {
  @scala.inline
  def apply(
    columns: js.Array[ColumnDefinition] = null,
    contentTypes: js.Array[ContentType] = null,
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: String = null,
    description: String = null,
    displayName: String = null,
    drive: Drive = null,
    eTag: String = null,
    id: String = null,
    items: js.Array[ListItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: String = null,
    list: ListInfo = null,
    name: String = null,
    parentReference: ItemReference = null,
    sharepointIds: SharepointIds = null,
    system: SystemFacet = null,
    webUrl: String = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contentTypes != null) __obj.updateDynamic("contentTypes")(contentTypes.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (drive != null) __obj.updateDynamic("drive")(drive.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference.asInstanceOf[js.Any])
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

