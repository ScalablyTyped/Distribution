package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the input parameter of setRowProperties. */
trait SettableRowProperties extends SettableCellProperties {
  @JSName("format")
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_RowHeightNumber] = js.undefined
  var rowHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object SettableRowProperties {
  @scala.inline
  def apply(
    format: CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_RowHeightNumber = null,
    hyperlink: RangeHyperlink = null,
    rowHidden: js.UndefOr[scala.Boolean] = js.undefined,
    style: java.lang.String = null
  ): SettableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SettableRowProperties]
  }
}

