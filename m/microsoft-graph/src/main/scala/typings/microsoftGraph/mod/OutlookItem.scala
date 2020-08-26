package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookItem extends Entity {
  // The categories associated with the item
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies the version of the item. Every time the item is changed, changeKey changes as well. This allows Exchange to
    * apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[String] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[String] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
}

object OutlookItem {
  @scala.inline
  def apply(): OutlookItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookItem]
  }
  @scala.inline
  implicit class OutlookItemOps[Self <: OutlookItem] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setChangeKey(value: String): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeKey: Self = this.set("changeKey", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
  }
  
}

