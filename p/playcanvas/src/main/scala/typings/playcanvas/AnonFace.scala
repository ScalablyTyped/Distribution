package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFace extends js.Object {
  var face: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
}

object AnonFace {
  @scala.inline
  def apply(face: Int | Double = null, level: Int | Double = null): AnonFace = {
    val __obj = js.Dynamic.literal()
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFace]
  }
}

