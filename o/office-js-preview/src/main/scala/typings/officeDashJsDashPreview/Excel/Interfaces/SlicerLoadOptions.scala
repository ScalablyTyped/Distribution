package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a slicer object in the workbook.
  *
  * [Api set: ExcelApi 1.10]
  */
trait SlicerLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var caption: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the unique id of slicer. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isFilterCleared: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the slicer name used in the formula.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameInFormula: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: "DataSourceOrder", "Ascending", "Descending".
    *
    * [Api set: ExcelApi 1.10]
    */
  var sortBy: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.10]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an "The argument is invalid or missing or has an incorrect format." exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi 1.10]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet containing the slicer.
    *
    * [Api set: ExcelApi 1.10]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object SlicerLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    caption: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    isFilterCleared: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    nameInFormula: js.UndefOr[Boolean] = js.undefined,
    sortBy: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): SlicerLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(caption)) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isFilterCleared)) __obj.updateDynamic("isFilterCleared")(isFilterCleared)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nameInFormula)) __obj.updateDynamic("nameInFormula")(nameInFormula)
    if (!js.isUndefined(sortBy)) __obj.updateDynamic("sortBy")(sortBy)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[SlicerLoadOptions]
  }
}

