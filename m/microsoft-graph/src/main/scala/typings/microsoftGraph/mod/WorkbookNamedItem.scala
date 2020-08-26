package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookNamedItem extends Entity {
  // Represents the comment associated with this name.
  var comment: js.UndefOr[String] = js.native
  // The name of the object. Read-only.
  var name: js.UndefOr[String] = js.native
  // Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
  var scope: js.UndefOr[String] = js.native
  /**
    * Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double,
    * Boolean, Range. Read-only.
    */
  var `type`: js.UndefOr[String] = js.native
  // Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
  var value: js.UndefOr[js.Any] = js.native
  // Specifies whether the object is visible or not.
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet.
    * Read-only.
    */
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.native
}

object WorkbookNamedItem {
  @scala.inline
  def apply(): WorkbookNamedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookNamedItem]
  }
  @scala.inline
  implicit class WorkbookNamedItemOps[Self <: WorkbookNamedItem] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWorksheet(value: WorkbookWorksheet): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

