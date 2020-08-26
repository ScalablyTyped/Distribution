package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookTableColumn extends Entity {
  // Retrieve the filter applied to the column. Read-only.
  var filter: js.UndefOr[WorkbookFilter] = js.native
  // Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
  var index: js.UndefOr[Double] = js.native
  // Returns the name of the table column.
  var name: js.UndefOr[String] = js.native
  /**
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell
    * that contain an error will return the error string.
    */
  var values: js.UndefOr[js.Any] = js.native
}

object WorkbookTableColumn {
  @scala.inline
  def apply(): WorkbookTableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookTableColumn]
  }
  @scala.inline
  implicit class WorkbookTableColumnOps[Self <: WorkbookTableColumn] (val x: Self) extends AnyVal {
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
    def setFilter(value: WorkbookFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

