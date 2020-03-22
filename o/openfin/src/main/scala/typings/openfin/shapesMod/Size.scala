package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends TransitionBase {
  var height: Double
  var width: Double
}

object Size {
  @scala.inline
  def apply(duration: Double, height: Double, width: Double, relative: js.UndefOr[Boolean] = js.undefined): Size = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

