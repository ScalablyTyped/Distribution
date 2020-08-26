package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerChecklistItem extends js.Object {
  // Value is true if the item is checked and false otherwise.
  var isChecked: js.UndefOr[Boolean] = js.native
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Used to set the relative order of items in the checklist. The format is defined as outlined here.
  var orderHint: js.UndefOr[String] = js.native
  // Title of the checklist item
  var title: js.UndefOr[String] = js.native
}

object PlannerChecklistItem {
  @scala.inline
  def apply(): PlannerChecklistItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerChecklistItem]
  }
  @scala.inline
  implicit class PlannerChecklistItemOps[Self <: PlannerChecklistItem] (val x: Self) extends AnyVal {
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
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: IdentitySet): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setOrderHint(value: String): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

