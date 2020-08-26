package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workbook extends Entity {
  var application: js.UndefOr[WorkbookApplication] = js.native
  var comments: js.UndefOr[js.Array[WorkbookComment]] = js.native
  var functions: js.UndefOr[WorkbookFunctions] = js.native
  // Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
  var names: js.UndefOr[js.Array[WorkbookNamedItem]] = js.native
  // Represents a collection of tables associated with the workbook. Read-only.
  var tables: js.UndefOr[js.Array[WorkbookTable]] = js.native
  // Represents a collection of worksheets associated with the workbook. Read-only.
  var worksheets: js.UndefOr[js.Array[WorkbookWorksheet]] = js.native
}

object Workbook {
  @scala.inline
  def apply(): Workbook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workbook]
  }
  @scala.inline
  implicit class WorkbookOps[Self <: Workbook] (val x: Self) extends AnyVal {
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
    def setApplication(value: WorkbookApplication): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: WorkbookComment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[WorkbookComment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setFunctions(value: WorkbookFunctions): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setNamesVarargs(value: WorkbookNamedItem*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[WorkbookNamedItem]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setTablesVarargs(value: WorkbookTable*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[WorkbookTable]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    @scala.inline
    def setWorksheetsVarargs(value: WorkbookWorksheet*): Self = this.set("worksheets", js.Array(value :_*))
    @scala.inline
    def setWorksheets(value: js.Array[WorkbookWorksheet]): Self = this.set("worksheets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheets: Self = this.set("worksheets", js.undefined)
  }
  
}

