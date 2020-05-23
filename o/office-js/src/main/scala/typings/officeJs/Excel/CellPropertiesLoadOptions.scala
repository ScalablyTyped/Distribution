package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which cell properties to load, when used as part of a "range.getCellProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesLoadOptions extends js.Object {
  /**
    *
    * Specifies whether to load on the `address` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `addressLocal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[CellPropertiesFormatLoadOptions] = js.undefined
  /**
    *
    * Specifies whether to load on the `hidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `hyperlink` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether to load on the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesLoadOptions {
  @scala.inline
  def apply(
    address: js.UndefOr[Boolean] = js.undefined,
    addressLocal: js.UndefOr[Boolean] = js.undefined,
    format: CellPropertiesFormatLoadOptions = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hyperlink: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined
  ): CellPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.get.asInstanceOf[js.Any])
    if (!js.isUndefined(addressLocal)) __obj.updateDynamic("addressLocal")(addressLocal.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hyperlink)) __obj.updateDynamic("hyperlink")(hyperlink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesLoadOptions]
  }
}

