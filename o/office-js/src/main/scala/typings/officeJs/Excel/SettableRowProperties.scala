package typings.officeJs.Excel

import typings.officeJs.anon.CellPropertiesFormatrowHe
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
  var format_SettableRowProperties: js.UndefOr[CellPropertiesFormatrowHe] = js.undefined
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
    format: CellPropertiesFormatrowHe = null,
    hyperlink: RangeHyperlink = null,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    style: String = null
  ): SettableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettableRowProperties]
  }
}

