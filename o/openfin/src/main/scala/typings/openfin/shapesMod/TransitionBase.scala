package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionBase extends js.Object {
  var duration: Double
  var relative: js.UndefOr[Boolean] = js.undefined
}

object TransitionBase {
  @scala.inline
  def apply(duration: Double, relative: js.UndefOr[Boolean] = js.undefined): TransitionBase = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionBase]
  }
}

