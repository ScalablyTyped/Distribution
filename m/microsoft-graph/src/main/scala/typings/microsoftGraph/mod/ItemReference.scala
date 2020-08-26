package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemReference extends js.Object {
  // Unique identifier of the drive instance that contains the item. Read-only.
  var driveId: js.UndefOr[String] = js.native
  // Identifies the type of drive. See [drive][] resource for values.
  var driveType: js.UndefOr[String] = js.native
  // Unique identifier of the item in the drive. Read-only.
  var id: js.UndefOr[String] = js.native
  // The name of the item being referenced. Read-only.
  var name: js.UndefOr[String] = js.native
  // Path that can be used to navigate to the item. Read-only.
  var path: js.UndefOr[String] = js.native
  // A unique identifier for a shared resource that can be accessed via the [Shares][] API.
  var shareId: js.UndefOr[String] = js.native
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  var siteId: js.UndefOr[String] = js.native
}

object ItemReference {
  @scala.inline
  def apply(): ItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemReference]
  }
  @scala.inline
  implicit class ItemReferenceOps[Self <: ItemReference] (val x: Self) extends AnyVal {
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
    def setDriveId(value: String): Self = this.set("driveId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveId: Self = this.set("driveId", js.undefined)
    @scala.inline
    def setDriveType(value: String): Self = this.set("driveType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriveType: Self = this.set("driveType", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setShareId(value: String): Self = this.set("shareId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareId: Self = this.set("shareId", js.undefined)
    @scala.inline
    def setSharepointIds(value: SharepointIds): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
  }
  
}

