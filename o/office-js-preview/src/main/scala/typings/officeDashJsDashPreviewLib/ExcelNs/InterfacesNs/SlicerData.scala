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
    * True if all filters currently applied on the slicer is cleared.
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
    * Represents the name used in the formula.
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
    * Represents the sort order of the items in the slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var sortBy: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.SlicerSortType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataSourceOrder | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ascending | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Descending
  ] = js.undefined
  /**
    *
    * Constant value that represents the Slicer style. Possible values are: SlicerStyleLight1 thru SlicerStyleLight6, TableStyleOther1 thru TableStyleOther2, SlicerStyleDark1 thru SlicerStyleDark6. A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the slicer to the right of the worksheet.
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

