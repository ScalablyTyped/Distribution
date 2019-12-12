package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the slicer objects on the workbook or a worksheet.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the caption of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var caption: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the height, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the unique id of slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isFilterCleared: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the name of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the slicer name used in the formula.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameInFormula: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.10]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the width, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the worksheet containing the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}

