package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the returned properties of getCellProperties. */
trait CellProperties extends SettableCellProperties {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var addressLocal: js.UndefOr[java.lang.String] = js.undefined
  var hasSpill: js.UndefOr[scala.Boolean] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
}

object CellProperties {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    addressLocal: java.lang.String = null,
    format: CellPropertiesFormat = null,
    hasSpill: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hyperlink: RangeHyperlink = null,
    style: java.lang.String = null
  ): CellProperties = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hasSpill)) __obj.updateDynamic("hasSpill")(hasSpill)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CellProperties]
  }
}

