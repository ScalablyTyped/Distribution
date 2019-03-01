package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents which column properties to load, when used as part of a "range.getColumnProperties" method. */
trait ColumnPropertiesLoadOptions extends CellPropertiesLoadOptions {
  var columnHidden: js.UndefOr[scala.Boolean] = js.undefined
  var columnIndex: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("format")
  var format_ColumnPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadOptions with officeDashJsDashPreviewLib.Anon_ColumnWidth] = js.undefined
}

object ColumnPropertiesLoadOptions {
  @scala.inline
  def apply(
    address: js.UndefOr[scala.Boolean] = js.undefined,
    addressLocal: js.UndefOr[scala.Boolean] = js.undefined,
    columnHidden: js.UndefOr[scala.Boolean] = js.undefined,
    columnIndex: js.UndefOr[scala.Boolean] = js.undefined,
    format: CellPropertiesFormatLoadOptions with officeDashJsDashPreviewLib.Anon_ColumnWidth = null,
    hasSpill: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hyperlink: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal)
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hasSpill)) __obj.updateDynamic("hasSpill")(hasSpill)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ColumnPropertiesLoadOptions]
  }
}

