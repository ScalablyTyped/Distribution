package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_ColumnWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which column properties to load, when used as part of a "range.getColumnProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ColumnPropertiesLoadOptions extends CellPropertiesLoadOptions {
  /**
    *
    * Specifies whether to load on the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `columnIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_ColumnPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadOptions with Anon_ColumnWidth] = js.undefined
}

object ColumnPropertiesLoadOptions {
  @scala.inline
  def apply(
    address: js.UndefOr[Boolean] = js.undefined,
    addressLocal: js.UndefOr[Boolean] = js.undefined,
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Boolean] = js.undefined,
    format: CellPropertiesFormatLoadOptions with Anon_ColumnWidth = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hyperlink: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined
  ): ColumnPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal)
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ColumnPropertiesLoadOptions]
  }
}

