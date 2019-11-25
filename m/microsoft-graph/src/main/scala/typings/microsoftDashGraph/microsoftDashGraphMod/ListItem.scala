package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends BaseItem {
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[ItemAnalytics] = js.undefined
  // The content type of this list item
  var contentType: js.UndefOr[ContentTypeInfo] = js.undefined
  // For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
  var driveItem: js.UndefOr[DriveItem] = js.undefined
  // The values of the columns set on this list item.
  var fields: js.UndefOr[FieldValueSet] = js.undefined
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  // The list of previous versions of the list item.
  var versions: js.UndefOr[js.Array[ListItemVersion]] = js.undefined
}

object ListItem {
  @scala.inline
  def apply(
    analytics: ItemAnalytics = null,
    contentType: ContentTypeInfo = null,
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: String = null,
    description: String = null,
    driveItem: DriveItem = null,
    eTag: String = null,
    fields: FieldValueSet = null,
    id: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: String = null,
    name: String = null,
    parentReference: ItemReference = null,
    sharepointIds: SharepointIds = null,
    versions: js.Array[ListItemVersion] = null,
    webUrl: String = null
  ): ListItem = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem.asInstanceOf[js.Any])
    if (eTag != null) __obj.updateDynamic("eTag")(eTag.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference.asInstanceOf[js.Any])
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}

