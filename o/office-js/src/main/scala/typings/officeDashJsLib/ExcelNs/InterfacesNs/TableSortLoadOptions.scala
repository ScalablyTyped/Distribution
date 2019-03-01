package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages sorting operations on Table objects.
  *
  * [Api set: ExcelApi 1.2]
  */
trait TableSortLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the current conditions used to last sort the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var fields: js.UndefOr[scala.Boolean] = js.undefined
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
  var method: js.UndefOr[scala.Boolean] = js.undefined
}

object TableSortLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined,
    method: js.UndefOr[scala.Boolean] = js.undefined
  ): TableSortLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[TableSortLoadOptions]
  }
}

