package typings
package officeDashJsLib.ExcelNs.InterfacesNs

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
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The currently applied filter on the given column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var criteria: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[scala.Boolean] = js.undefined, criteria: js.UndefOr[scala.Boolean] = js.undefined): FilterLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(criteria)) __obj.updateDynamic("criteria")(criteria)
    __obj.asInstanceOf[FilterLoadOptions]
  }
}

