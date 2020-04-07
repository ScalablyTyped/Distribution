package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * RangeAreas represents a collection of one or more rectangular ranges in the same worksheet.
  To learn how to use discontinguous ranges, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-multiple-ranges | Work with multiple ranges simultaneously in Excel add-ins}.
  *
  * [Api set: ExcelApi 1.9]
  */
trait RangeAreasLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the RageAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g. "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the RageAreas reference in the user locale. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areaCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var cellCount: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.undefined
  /**
    *
    * Returns a rangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.undefined
  /**
    *
    * Indicates whether all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates whether all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7"). Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the worksheet for the current RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object RangeAreasLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    address: js.UndefOr[Boolean] = js.undefined,
    addressLocal: js.UndefOr[Boolean] = js.undefined,
    areaCount: js.UndefOr[Boolean] = js.undefined,
    cellCount: js.UndefOr[Boolean] = js.undefined,
    dataValidation: DataValidationLoadOptions = null,
    format: RangeFormatLoadOptions = null,
    isEntireColumn: js.UndefOr[Boolean] = js.undefined,
    isEntireRow: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): RangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(areaCount)) __obj.updateDynamic("areaCount")(areaCount.asInstanceOf[js.Any])
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.asInstanceOf[js.Any])
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireColumn)) __obj.updateDynamic("isEntireColumn")(isEntireColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireRow)) __obj.updateDynamic("isEntireRow")(isEntireRow.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAreasLoadOptions]
  }
}

