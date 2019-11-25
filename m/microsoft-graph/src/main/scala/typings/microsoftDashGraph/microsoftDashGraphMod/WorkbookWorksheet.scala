package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookWorksheet extends Entity {
  // Returns collection of charts that are part of the worksheet. Read-only.
  var charts: js.UndefOr[js.Array[WorkbookChart]] = js.undefined
  // The display name of the worksheet.
  var name: js.UndefOr[String] = js.undefined
  // Returns collection of names that are associated with the worksheet. Read-only.
  var names: js.UndefOr[js.Array[WorkbookNamedItem]] = js.undefined
  // Collection of PivotTables that are part of the worksheet.
  var pivotTables: js.UndefOr[js.Array[WorkbookPivotTable]] = js.undefined
  // The zero-based position of the worksheet within the workbook.
  var position: js.UndefOr[Double] = js.undefined
  // Returns sheet protection object for a worksheet. Read-only.
  var protection: js.UndefOr[WorkbookWorksheetProtection] = js.undefined
  // Collection of tables that are part of the worksheet. Read-only.
  var tables: js.UndefOr[js.Array[WorkbookTable]] = js.undefined
  // The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
  var visibility: js.UndefOr[String] = js.undefined
}

object WorkbookWorksheet {
  @scala.inline
  def apply(
    charts: js.Array[WorkbookChart] = null,
    id: String = null,
    name: String = null,
    names: js.Array[WorkbookNamedItem] = null,
    pivotTables: js.Array[WorkbookPivotTable] = null,
    position: Int | Double = null,
    protection: WorkbookWorksheetProtection = null,
    tables: js.Array[WorkbookTable] = null,
    visibility: String = null
  ): WorkbookWorksheet = {
    val __obj = js.Dynamic.literal()
    if (charts != null) __obj.updateDynamic("charts")(charts.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookWorksheet]
  }
}

