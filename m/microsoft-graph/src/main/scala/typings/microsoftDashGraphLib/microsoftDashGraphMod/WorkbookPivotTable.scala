package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookPivotTable extends Entity {
  // Name of the PivotTable.
  var name: js.UndefOr[java.lang.String] = js.undefined
  // The worksheet containing the current PivotTable. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookPivotTable {
  @scala.inline
  def apply(id: java.lang.String = null, name: java.lang.String = null, worksheet: WorkbookWorksheet = null): WorkbookPivotTable = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[WorkbookPivotTable]
  }
}

