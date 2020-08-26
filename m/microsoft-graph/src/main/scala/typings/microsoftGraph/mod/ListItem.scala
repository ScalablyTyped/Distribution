package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItem extends BaseItem {
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[ItemAnalytics] = js.native
  // The content type of this list item
  var contentType: js.UndefOr[ContentTypeInfo] = js.native
  // For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
  var driveItem: js.UndefOr[DriveItem] = js.native
  // The values of the columns set on this list item.
  var fields: js.UndefOr[FieldValueSet] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // The list of previous versions of the list item.
  var versions: js.UndefOr[js.Array[ListItemVersion]] = js.native
}

object ListItem {
  @scala.inline
  def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  @scala.inline
  implicit class ListItemOps[Self <: ListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalytics(value: ItemAnalytics): Self = this.set("analytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    @scala.inline
    def setContentType(value: ContentTypeInfo): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setDriveItem(value: DriveItem): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
    @scala.inline
    def setFields(value: FieldValueSet): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setSharepointIds(value: SharepointIds): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: ListItemVersion*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[ListItemVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

