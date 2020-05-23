package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Face extends js.Object {
  var face: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
}

object Face {
  @scala.inline
  def apply(face: js.UndefOr[Double] = js.undefined, level: js.UndefOr[Double] = js.undefined): Face = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(face)) __obj.updateDynamic("face")(face.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
}

