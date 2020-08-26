package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookPivotTable extends Entity {
  // Name of the PivotTable.
  var name: js.UndefOr[String] = js.native
  // The worksheet containing the current PivotTable. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.native
}

object WorkbookPivotTable {
  @scala.inline
  def apply(): WorkbookPivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookPivotTable]
  }
  @scala.inline
  implicit class WorkbookPivotTableOps[Self <: WorkbookPivotTable] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setWorksheet(value: WorkbookWorksheet): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

