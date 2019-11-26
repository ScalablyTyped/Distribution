package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Manages the filtering of a table's column.
  *
  * [Api set: ExcelApi 1.2]
  */
trait FilterLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[Boolean] = js.undefined
}

object FilterLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, criteria: js.UndefOr[Boolean] = js.undefined): FilterLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(criteria)) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLoadOptions]
  }
}

