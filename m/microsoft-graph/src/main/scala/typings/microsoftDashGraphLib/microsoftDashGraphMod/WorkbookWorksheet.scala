package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWorksheet extends Entity {
  // Returns collection of charts that are part of the worksheet. Read-only.
  var charts: js.UndefOr[js.Array[WorkbookChart]] = js.undefined
  // The display name of the worksheet.
  var name: js.UndefOr[java.lang.String] = js.undefined
  // Returns collection of names that are associated with the worksheet. Read-only.
  var names: js.UndefOr[js.Array[WorkbookNamedItem]] = js.undefined
  // Collection of PivotTables that are part of the worksheet.
  var pivotTables: js.UndefOr[js.Array[WorkbookPivotTable]] = js.undefined
  // The zero-based position of the worksheet within the workbook.
  var position: js.UndefOr[scala.Double] = js.undefined
  // Returns sheet protection object for a worksheet. Read-only.
  var protection: js.UndefOr[WorkbookWorksheetProtection] = js.undefined
  // Collection of tables that are part of the worksheet. Read-only.
  var tables: js.UndefOr[js.Array[WorkbookTable]] = js.undefined
  // The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookWorksheet {
  @scala.inline
  def apply(
    charts: js.Array[WorkbookChart] = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    names: js.Array[WorkbookNamedItem] = null,
    pivotTables: js.Array[WorkbookPivotTable] = null,
    position: scala.Int | scala.Double = null,
    protection: WorkbookWorksheetProtection = null,
    tables: js.Array[WorkbookTable] = null,
    visibility: java.lang.String = null
  ): WorkbookWorksheet = {
    val __obj = js.Dynamic.literal()
    if (charts != null) __obj.updateDynamic("charts")(charts)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[WorkbookWorksheet]
  }
}

