package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workbook extends Entity {
  var application: js.UndefOr[WorkbookApplication] = js.undefined
  var comments: js.UndefOr[js.Array[WorkbookComment]] = js.undefined
  var functions: js.UndefOr[WorkbookFunctions] = js.undefined
  // Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
  var names: js.UndefOr[js.Array[WorkbookNamedItem]] = js.undefined
  // Represents a collection of tables associated with the workbook. Read-only.
  var tables: js.UndefOr[js.Array[WorkbookTable]] = js.undefined
  // Represents a collection of worksheets associated with the workbook. Read-only.
  var worksheets: js.UndefOr[js.Array[WorkbookWorksheet]] = js.undefined
}

object Workbook {
  @scala.inline
  def apply(
    application: WorkbookApplication = null,
    comments: js.Array[WorkbookComment] = null,
    functions: WorkbookFunctions = null,
    id: String = null,
    names: js.Array[WorkbookNamedItem] = null,
    tables: js.Array[WorkbookTable] = null,
    worksheets: js.Array[WorkbookWorksheet] = null
  ): Workbook = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (worksheets != null) __obj.updateDynamic("worksheets")(worksheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workbook]
  }
}

