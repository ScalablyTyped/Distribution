package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `workbookRangeAreas.toJSON()`. */
trait WorkbookRangeAreasData extends js.Object {
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var addresses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    *
    * Returns the RangeAreasCollection object, each RangeAreas in the collection represent one or more rectangle ranges in one worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var areas: js.UndefOr[js.Array[RangeAreasData]] = js.undefined
  /**
    *
    * Returns a collection of ranges that comprises this object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var ranges: js.UndefOr[js.Array[RangeData]] = js.undefined
}

object WorkbookRangeAreasData {
  @scala.inline
  def apply(
    addresses: js.Array[String] = null,
    areas: js.Array[RangeAreasData] = null,
    ranges: js.Array[RangeData] = null
  ): WorkbookRangeAreasData = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (areas != null) __obj.updateDynamic("areas")(areas.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookRangeAreasData]
  }
}

