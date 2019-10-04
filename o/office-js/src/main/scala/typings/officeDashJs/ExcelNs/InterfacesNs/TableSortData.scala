package typings.officeDashJs.ExcelNs.InterfacesNs

import typings.officeDashJs.ExcelNs.SortField
import typings.officeDashJs.ExcelNs.SortMethod
import typings.officeDashJs.officeDashJsStrings.PinYin
import typings.officeDashJs.officeDashJsStrings.StrokeCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `tableSort.toJSON()`. */
trait TableSortData extends js.Object {
  /**
    *
    * Represents the current conditions used to last sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[js.Array[SortField]] = js.undefined
  /**
    *
    * Represents whether the casing impacted the last sort of the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents Chinese character ordering method last used to sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var method: js.UndefOr[SortMethod | PinYin | StrokeCount] = js.undefined
}

object TableSortData {
  @scala.inline
  def apply(
    fields: js.Array[SortField] = null,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    method: SortMethod | PinYin | StrokeCount = null
  ): TableSortData = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortData]
  }
}

