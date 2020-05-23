package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeAreas.toJSON()`. */
trait RangeAreasData extends js.Object {
  /**
    *
    * Returns the RangeAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4").
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the RangeAreas reference in the user locale.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areaCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns a collection of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areas: js.UndefOr[js.Array[RangeData]] = js.undefined
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.9]
    */
  var cellCount: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns a collection of ConditionalFormats that intersect with any cells in this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatData]] = js.undefined
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationData] = js.undefined
  /**
    *
    * Returns a RangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatData] = js.undefined
  /**
    *
    * Specifies if all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z").
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7").
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
  var style: js.UndefOr[String] = js.undefined
}

object RangeAreasData {
  @scala.inline
  def apply(
    address: String = null,
    addressLocal: String = null,
    areaCount: js.UndefOr[Double] = js.undefined,
    areas: js.Array[RangeData] = null,
    cellCount: js.UndefOr[Double] = js.undefined,
    conditionalFormats: js.Array[ConditionalFormatData] = null,
    dataValidation: DataValidationData = null,
    format: RangeFormatData = null,
    isEntireColumn: js.UndefOr[Boolean] = js.undefined,
    isEntireRow: js.UndefOr[Boolean] = js.undefined,
    style: String = null
  ): RangeAreasData = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(areaCount)) __obj.updateDynamic("areaCount")(areaCount.get.asInstanceOf[js.Any])
    if (areas != null) __obj.updateDynamic("areas")(areas.asInstanceOf[js.Any])
    if (!js.isUndefined(cellCount)) __obj.updateDynamic("cellCount")(cellCount.get.asInstanceOf[js.Any])
    if (conditionalFormats != null) __obj.updateDynamic("conditionalFormats")(conditionalFormats.asInstanceOf[js.Any])
    if (dataValidation != null) __obj.updateDynamic("dataValidation")(dataValidation.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireColumn)) __obj.updateDynamic("isEntireColumn")(isEntireColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEntireRow)) __obj.updateDynamic("isEntireRow")(isEntireRow.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAreasData]
  }
}

