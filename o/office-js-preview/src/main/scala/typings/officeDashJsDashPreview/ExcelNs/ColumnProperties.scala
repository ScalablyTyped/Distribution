package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_ColumnWidthNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the returned properties of getColumnProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ColumnProperties extends SettableColumnProperties {
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
    * Represents the `columnIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
}

object ColumnProperties {
  @scala.inline
  def apply(
    address: String = null,
    addressLocal: String = null,
    columnHidden: js.UndefOr[Boolean] = js.undefined,
    columnIndex: Int | Double = null,
    format: CellPropertiesFormat with Anon_ColumnWidthNumber = null,
    hyperlink: RangeHyperlink = null,
    style: String = null
  ): ColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressLocal != null) __obj.updateDynamic("addressLocal")(addressLocal)
    if (!js.isUndefined(columnHidden)) __obj.updateDynamic("columnHidden")(columnHidden)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ColumnProperties]
  }
}

