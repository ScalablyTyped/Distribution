package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetY extends js.Object {
  var offsetY: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_OffsetY {
  @scala.inline
  def apply(offsetY: Int | Double = null, rowIndex: Int | Double = null, y: Int | Double = null): Anon_OffsetY = {
    val __obj = js.Dynamic.literal()
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OffsetY]
  }
}

