package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the returned properties of getColumnProperties. */
trait ColumnProperties extends SettableColumnProperties {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var addressLocal: js.UndefOr[java.lang.String] = js.undefined
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
}

object ColumnProperties {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    addressLocal: java.lang.String = null,
    columnHidden: js.UndefOr[scala.Boolean] = js.undefined,
    columnIndex: scala.Int | scala.Double = null,
    format: CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_ColumnWidthNumber = null,
    hyperlink: RangeHyperlink = null,
    style: java.lang.String = null
  ): ColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal)
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ColumnProperties]
  }
}

