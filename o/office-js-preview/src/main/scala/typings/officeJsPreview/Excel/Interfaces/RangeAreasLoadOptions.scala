package typings.officeJsPreview.Excel.Interfaces

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
@js.native
trait RangeAreasLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the RangeAreas reference in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4").
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the RangeAreas reference in the user locale.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the number of rectangular ranges that comprise this RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var areaCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the number of cells in the RangeAreas object, summing up the cell counts of all of the individual rectangular ranges. Returns -1 if the cell count exceeds 2^31-1 (2,147,483,647).
    *
    * [Api set: ExcelApi 1.9]
    */
  var cellCount: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a dataValidation object for all ranges in the RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var dataValidation: js.UndefOr[DataValidationLoadOptions] = js.native
  /**
    *
    * Returns a RangeFormat object, encapsulating the the font, fill, borders, alignment, and other properties for all ranges in the RangeAreas object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[RangeFormatLoadOptions] = js.native
  /**
    *
    * Specifies if all the ranges on this RangeAreas object represent entire columns (e.g., "A:C, Q:Z").
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireColumn: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if all the ranges on this RangeAreas object represent entire rows (e.g., "1:3, 5:7").
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEntireRow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the style for all ranges in this RangeAreas object.
    If the styles of the cells are inconsistent, null will be returned.
    For custom styles, the style name will be returned. For built-in styles, a string representing a value in the BuiltInStyle enum will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the worksheet for the current RangeAreas.
    *
    * [Api set: ExcelApi 1.9]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}

object RangeAreasLoadOptions {
  @scala.inline
  def apply(): RangeAreasLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeAreasLoadOptions]
  }
  @scala.inline
  implicit class RangeAreasLoadOptionsOps[Self <: RangeAreasLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAddress(value: Boolean): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAddressLocal(value: Boolean): Self = this.set("addressLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLocal: Self = this.set("addressLocal", js.undefined)
    @scala.inline
    def setAreaCount(value: Boolean): Self = this.set("areaCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaCount: Self = this.set("areaCount", js.undefined)
    @scala.inline
    def setCellCount(value: Boolean): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellCount: Self = this.set("cellCount", js.undefined)
    @scala.inline
    def setDataValidation(value: DataValidationLoadOptions): Self = this.set("dataValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataValidation: Self = this.set("dataValidation", js.undefined)
    @scala.inline
    def setFormat(value: RangeFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIsEntireColumn(value: Boolean): Self = this.set("isEntireColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEntireColumn: Self = this.set("isEntireColumn", js.undefined)
    @scala.inline
    def setIsEntireRow(value: Boolean): Self = this.set("isEntireRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEntireRow: Self = this.set("isEntireRow", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

