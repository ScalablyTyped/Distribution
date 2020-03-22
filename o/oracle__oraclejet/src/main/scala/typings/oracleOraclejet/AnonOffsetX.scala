package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffsetX[K] extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[K] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var parent: js.UndefOr[K] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnonOffsetX {
  @scala.inline
  def apply[K](
    index: Int | Double = null,
    key: K = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    parent: K = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonOffsetX[K] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffsetX[K]]
  }
}

