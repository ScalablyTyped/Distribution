package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_RowHeightNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned properties of getRowProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait RowProperties extends SettableRowProperties {
  /**
    *
    * Represents the `address` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `addressLocal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the `rowIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object RowProperties {
  @scala.inline
  def apply(
    address: String = null,
    addressLocal: String = null,
    format: CellPropertiesFormat with Anon_RowHeightNumber = null,
    hyperlink: RangeHyperlink = null,
    rowHidden: js.UndefOr[Boolean] = js.undefined,
    rowIndex: Int | Double = null,
    style: String = null
  ): RowProperties = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal)
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (!js.isUndefined(rowHidden)) __obj.updateDynamic("rowHidden")(rowHidden)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[RowProperties]
  }
}

