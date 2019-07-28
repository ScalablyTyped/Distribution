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
    if (analytics != null) __obj.updateDynamic("analytics")(analytics)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (driveItem != null) __obj.updateDynamic("driveItem")(driveItem)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[ListItem]
  }
}

