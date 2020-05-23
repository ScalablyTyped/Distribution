package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends TransitionBase {
  var left: Double
  var top: Double
}

object Position {
  @scala.inline
  def apply(duration: Double, left: Double, top: Double, relative: js.UndefOr[Boolean] = js.undefined): Position = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

