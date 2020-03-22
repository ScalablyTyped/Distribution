package typings.officeJs.Excel

import typings.officeJs.CellPropertiesFormatLoadO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which row properties to load, when used as part of a "range.getRowProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
trait RowPropertiesLoadOptions extends CellPropertiesLoadOptions {
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_RowPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadO] = js.undefined
  /**
    *
    * Specifies whether to load on the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `rowIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
}

object RowPropertiesLoadOptions {
  @scala.inline
  def apply(
    address: js.UndefOr[Boolean] = js.undefined,
    addressLocal: js.UndefOr[Boolean] = js.undefined,
    format: CellPropertiesFormatLoadO = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hyperlink: js.UndefOr[Boolean] = js.undefined,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    rowIndex: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined
  ): RowPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowPropertiesLoadOptions]
  }
}

