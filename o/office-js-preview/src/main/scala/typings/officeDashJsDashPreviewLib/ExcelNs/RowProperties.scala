package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the returned properties of getRowProperties. */
trait RowProperties extends SettableRowProperties {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var addressLocal: js.UndefOr[java.lang.String] = js.undefined
  var hasSpill: js.UndefOr[scala.Boolean] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object RowProperties {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    addressLocal: java.lang.String = null,
    format: CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_RowHeightNumber = null,
    hasSpill: js.UndefOr[scala.Boolean] = js.undefined,
    hyperlink: RangeHyperlink = null,
    rowHidden: js.UndefOr[scala.Boolean] = js.undefined,
    rowIndex: scala.Int | scala.Double = null,
    style: java.lang.String = null
  ): RowProperties = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hasSpill)) __obj.updateDynamic("hasSpill")(hasSpill)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[RowProperties]
  }
}

