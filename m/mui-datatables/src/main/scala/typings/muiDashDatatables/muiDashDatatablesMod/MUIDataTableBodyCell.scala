package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableBodyCell extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var colIndex: js.UndefOr[Double] = js.undefined
  var columnHeader: js.UndefOr[js.Any] = js.undefined
  var dataIndex: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var otherProps: js.UndefOr[js.Any] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object MUIDataTableBodyCell {
  @scala.inline
  def apply(
    children: js.Any = null,
    className: String = null,
    classes: js.Object = null,
    colIndex: Int | Double = null,
    columnHeader: js.Any = null,
    dataIndex: Int | Double = null,
    options: js.Object = null,
    otherProps: js.Any = null,
    rowIndex: Int | Double = null
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

