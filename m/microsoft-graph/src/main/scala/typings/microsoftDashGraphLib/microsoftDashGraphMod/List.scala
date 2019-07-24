package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends BaseItem {
  // The collection of field definitions for this list.
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.undefined
  // The collection of content types present in this list.
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.undefined
  // The displayable title of the list.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
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
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    drive: Drive = null,
    eTag: java.lang.String = null,
    id: java.lang.String = null,
    items: js.Array[ListItem] = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: java.lang.String = null,
    list: ListInfo = null,
    name: java.lang.String = null,
    parentReference: ItemReference = null,
    sharepointIds: SharepointIds = null,
    system: SystemFacet = null,
    webUrl: java.lang.String = null
  ): List = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (contentTypes != null) __obj.updateDynamic("contentTypes")(contentTypes)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (drive != null) __obj.updateDynamic("drive")(drive)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (items != null) __obj.updateDynamic("items")(items)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (list != null) __obj.updateDynamic("list")(list)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds)
    if (system != null) __obj.updateDynamic("system")(system)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[List]
  }
}

