package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableSort.toJSON()". */
trait TableSortData extends js.Object {
  /**
    *
    * Represents the current conditions used to last sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[officeDashJsDashPreviewLib.ExcelNs.SortField]] = js.undefined
  /**
    *
    * Represents whether the casing impacted the last sort of the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents Chinese character ordering method last used to sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.SortMethod | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PinYin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StrokeCount
  ] = js.undefined
}

object TableSortData {
  @scala.inline
  def apply(
    fields: js.Array[officeDashJsDashPreviewLib.ExcelNs.SortField] = null,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined,
    method: officeDashJsDashPreviewLib.ExcelNs.SortMethod | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PinYin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StrokeCount = null
  ): TableSortData = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortData]
  }
}

