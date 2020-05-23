package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opacity extends TransitionBase {
  var opacity: Double
}

object Opacity {
  @scala.inline
  def apply(duration: Double, opacity: Double, relative: js.UndefOr[Boolean] = js.undefined): Opacity = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
}

