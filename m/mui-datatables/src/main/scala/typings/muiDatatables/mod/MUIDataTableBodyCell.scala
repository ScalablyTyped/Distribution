package typings.muiDatatables.mod

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
    colIndex: js.UndefOr[Double] = js.undefined,
    columnHeader: js.Any = null,
    dataIndex: js.UndefOr[Double] = js.undefined,
    options: js.Object = null,
    otherProps: js.Any = null,
    rowIndex: js.UndefOr[Double] = js.undefined
  ): MUIDataTableBodyCell = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(colIndex)) __obj.updateDynamic("colIndex")(colIndex.get.asInstanceOf[js.Any])
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(dataIndex)) __obj.updateDynamic("dataIndex")(dataIndex.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableBodyCell]
  }
}

