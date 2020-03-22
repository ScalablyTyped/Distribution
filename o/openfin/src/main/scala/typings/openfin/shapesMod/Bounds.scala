package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var height: Double
  var left: Double
  var right: js.UndefOr[Double] = js.undefined
  var top: Double
  var width: Double
}

object Bounds {
  @scala.inline
  def apply(
    height: Double,
    left: Double,
    top: Double,
    width: Double,
    bottom: Int | Double = null,
    right: Int | Double = null
  ): Bounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

