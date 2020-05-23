package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetY extends js.Object {
  var offsetY: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object OffsetY {
  @scala.inline
  def apply(
    offsetY: js.UndefOr[Double] = js.undefined,
    rowIndex: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): OffsetY = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowIndex)) __obj.updateDynamic("rowIndex")(rowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetY]
  }
}

