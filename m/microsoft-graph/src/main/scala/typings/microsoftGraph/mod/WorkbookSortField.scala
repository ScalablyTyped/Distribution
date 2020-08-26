package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSortField extends js.Object {
  // Represents whether the sorting is done in an ascending fashion.
  var ascending: js.UndefOr[Boolean] = js.native
  // Represents the color that is the target of the condition if the sorting is on font or cell color.
  var color: js.UndefOr[String] = js.native
  // Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
  var dataOption: js.UndefOr[String] = js.native
  // Represents the icon that is the target of the condition if the sorting is on the cell's icon.
  var icon: js.UndefOr[WorkbookIcon] = js.native
  /**
    * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset
    * from the first column (or row).
    */
  var key: js.UndefOr[Double] = js.native
  // Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
  var sortOn: js.UndefOr[String] = js.native
}

object WorkbookSortField {
  @scala.inline
  def apply(): WorkbookSortField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSortField]
  }
  @scala.inline
  implicit class WorkbookSortFieldOps[Self <: WorkbookSortField] (val x: Self) extends AnyVal {
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscending: Self = this.set("ascending", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDataOption(value: String): Self = this.set("dataOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataOption: Self = this.set("dataOption", js.undefined)
    @scala.inline
    def setIcon(value: WorkbookIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setSortOn(value: String): Self = this.set("sortOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOn: Self = this.set("sortOn", js.undefined)
  }
  
}

