package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseItem extends Entity {
  // Identity of the user, device, or application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // Identity of the user who created the item. Read-only.
  var createdByUser: js.UndefOr[User] = js.native
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[String] = js.native
  // Provides a user-visible description of the item. Optional.
  var description: js.UndefOr[String] = js.native
  // ETag for the item. Read-only.
  var eTag: js.UndefOr[String] = js.native
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  // Identity of the user who last modified the item. Read-only.
  var lastModifiedByUser: js.UndefOr[User] = js.native
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The name of the item. Read-write.
  var name: js.UndefOr[String] = js.native
  // Parent information, if the item has a parent. Read-write.
  var parentReference: js.UndefOr[ItemReference] = js.native
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[String] = js.native
}

object BaseItem {
  @scala.inline
  def apply(): BaseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItem]
  }
  @scala.inline
  implicit class BaseItemOps[Self <: BaseItem] (val x: Self) extends AnyVal {
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
    def setCreatedBy(value: IdentitySet): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setCreatedByUser(value: User): Self = this.set("createdByUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedByUser: Self = this.set("createdByUser", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("eTag", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: IdentitySet): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedByUser(value: User): Self = this.set("lastModifiedByUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedByUser: Self = this.set("lastModifiedByUser", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentReference(value: ItemReference): Self = this.set("parentReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentReference: Self = this.set("parentReference", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

