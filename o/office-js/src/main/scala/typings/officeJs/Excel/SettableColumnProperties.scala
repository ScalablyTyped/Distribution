package typings.officeJs.Excel

import typings.officeJs.AnonColumnWidthNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setColumnProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableColumnProperties extends SettableCellProperties {
  /**
    *
    * Represents the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableColumnProperties: js.UndefOr[CellPropertiesFormat with AnonColumnWidthNumber] = js.undefined
}

object SettableColumnProperties {
  @scala.inline
  def apply(
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    format: CellPropertiesFormat with AnonColumnWidthNumber = null,
    hyperlink: RangeHyperlink = null,
    style: String = null
  ): SettableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableColumnProperties]
  }
}

