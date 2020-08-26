package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenoteEntityHierarchyModel extends OnenoteEntitySchemaObjectModel {
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // The name of the notebook.
  var displayName: js.UndefOr[String] = js.native
  // Identity of the user, device, and application which created the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  /**
    * The date and time when the notebook was last modified. The timestamp represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
}

object OnenoteEntityHierarchyModel {
  @scala.inline
  def apply(): OnenoteEntityHierarchyModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntityHierarchyModel]
  }
  @scala.inline
  implicit class OnenoteEntityHierarchyModelOps[Self <: OnenoteEntityHierarchyModel] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: IdentitySet): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
  }
  
}

