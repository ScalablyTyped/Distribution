package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetY extends js.Object {
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_OffsetY {
  @scala.inline
  def apply(
    offsetY: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_OffsetY = {
    val __obj = js.Dynamic.literal()
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OffsetY]
  }
}

