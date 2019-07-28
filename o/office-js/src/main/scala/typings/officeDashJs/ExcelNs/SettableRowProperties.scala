package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_RowHeightNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableRowProperties extends SettableCellProperties {
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormat with Anon_RowHeightNumber] = js.undefined
  /**
    *
    * Represents the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
}

object SettableRowProperties {
  @scala.inline
  def apply(
    format: CellPropertiesFormat with Anon_RowHeightNumber = null,
    hyperlink: RangeHyperlink = null,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    style: String = null
  ): SettableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SettableRowProperties]
  }
}

