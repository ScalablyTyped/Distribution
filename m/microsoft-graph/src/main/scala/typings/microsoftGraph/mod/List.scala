package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List extends BaseItem {
  // The collection of field definitions for this list.
  var columns: js.UndefOr[js.Array[ColumnDefinition]] = js.native
  // The collection of content types present in this list.
  var contentTypes: js.UndefOr[js.Array[ContentType]] = js.native
  // The displayable title of the list.
  var displayName: js.UndefOr[String] = js.native
  // Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
  var drive: js.UndefOr[Drive] = js.native
  // All items contained in the list.
  var items: js.UndefOr[js.Array[ListItem]] = js.native
  // Provides additional details about the list.
  var list: js.UndefOr[ListInfo] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // The set of subscriptions on the list.
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  // If present, indicates that this is a system-managed list. Read-only.
  var system: js.UndefOr[SystemFacet] = js.native
}

object List {
  @scala.inline
  def apply(): List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: ColumnDefinition*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[ColumnDefinition]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContentTypesVarargs(value: ContentType*): Self = this.set("contentTypes", js.Array(value :_*))
    @scala.inline
    def setContentTypes(value: js.Array[ContentType]): Self = this.set("contentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTypes: Self = this.set("contentTypes", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDrive(value: Drive): Self = this.set("drive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrive: Self = this.set("drive", js.undefined)
    @scala.inline
    def setItemsVarargs(value: ListItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ListItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setList(value: ListInfo): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setSharepointIds(value: SharepointIds): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    @scala.inline
    def setSubscriptionsVarargs(value: Subscription*): Self = this.set("subscriptions", js.Array(value :_*))
    @scala.inline
    def setSubscriptions(value: js.Array[Subscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
    @scala.inline
    def setSystem(value: SystemFacet): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

