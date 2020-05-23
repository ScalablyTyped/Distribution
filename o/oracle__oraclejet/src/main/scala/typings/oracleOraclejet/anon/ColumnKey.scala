package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnKey extends js.Object {
  var columnIndex: js.UndefOr[Double] = js.undefined
  var columnKey: js.UndefOr[js.Any] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowKey: js.UndefOr[js.Any] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object ColumnKey {
  @scala.inline
  def apply(
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: js.Any = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    rowKey: js.Any = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ColumnKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnKey]
  }
}

