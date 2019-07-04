package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "slicer.toJSON()". */
trait SlicerData extends js.Object {
  /**
    *
    * Represents the caption of slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the height, in points, of the slicer.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the unique id of slicer. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * True if all filters currently applied on the slicer are cleared.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isFilterCleared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left side of the slicer to the left of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the name of slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the slicer name used in the formula.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var nameInFormula: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the collection of SlicerItems that are part of the slicer. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var slicerItems: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
  /**
    *
    * Represents the sort order of the items in the slicer. Possible values are: DataSourceOrder, Ascending, Descending.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var sortBy: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.SlicerSortType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataSourceOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ascending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Descending
  ] = js.undefined
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: "SlicerStyleLight1" through "SlicerStyleLight6", "TableStyleOther1" through "TableStyleOther2", "SlicerStyleDark1" through "SlicerStyleDark6". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the top of the worksheet.
    Throws an invalid argument exception when set with negative value as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the width, in points, of the slicer.
    Throws an invalid argument exception when set with negative value or zero as input.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the worksheet containing the slicer. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var worksheet: js.UndefOr[WorksheetData] = js.undefined
}

object SlicerData {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    isFilterCleared: js.UndefOr[scala.Boolean] = js.undefined,
    left: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    nameInFormula: java.lang.String = null,
    slicerItems: js.Array[SlicerItemData] = null,
    sortBy: officeDashJsDashPreviewLib.ExcelNs.SlicerSortType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataSourceOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ascending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Descending = null,
    style: java.lang.String = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    worksheet: WorksheetData = null
  ): SlicerData = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isFilterCleared)) __obj.updateDynamic("isFilterCleared")(isFilterCleared)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameInFormula != null) __obj.updateDynamic("nameInFormula")(nameInFormula)
    if (slicerItems != null) __obj.updateDynamic("slicerItems")(slicerItems)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[SlicerData]
  }
}

