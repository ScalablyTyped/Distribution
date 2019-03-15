package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableBodyCell extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var colIndex: js.UndefOr[scala.Double] = js.undefined
  var columnHeader: js.UndefOr[js.Any] = js.undefined
  var dataIndex: js.UndefOr[scala.Double] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var otherProps: js.UndefOr[js.Any] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object MUIDataTableBodyCell {
  @scala.inline
  def apply(
    children: js.Any = null,
    className: java.lang.String = null,
    classes: js.Object = null,
    colIndex: scala.Int | scala.Double = null,
    columnHeader: js.Any = null,
    dataIndex: scala.Int | scala.Double = null,
    options: js.Object = null,
    otherProps: js.Any = null,
    rowIndex: scala.Int | scala.Double = null
  ): MUIDataTableBodyCell = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader)
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBodyCell]
  }
}

