package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setRowProperties.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  */
trait SettableRowProperties extends SettableCellProperties {
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
  @JSName("format")
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormat with officeDashJsDashPreviewLib.Anon_RowHeightNumber] = js.undefined
  /**
    *
    * Represents the `rowHidden` property.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    */
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

