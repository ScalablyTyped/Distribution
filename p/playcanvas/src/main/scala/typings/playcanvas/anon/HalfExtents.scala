package typings.playcanvas.anon

import typings.playcanvas.pc.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HalfExtents extends js.Object {
  var halfExtents: js.UndefOr[Vec2] = js.undefined
  var lengthSegments: js.UndefOr[Double] = js.undefined
  var widthSegments: js.UndefOr[Double] = js.undefined
}

object HalfExtents {
  @scala.inline
  def apply(
    halfExtents: Vec2 = null,
    lengthSegments: js.UndefOr[Double] = js.undefined,
    widthSegments: js.UndefOr[Double] = js.undefined
  ): HalfExtents = {
    val __obj = js.Dynamic.literal()
    if (halfExtents != null) __obj.updateDynamic("halfExtents")(halfExtents.asInstanceOf[js.Any])
    if (!js.isUndefined(lengthSegments)) __obj.updateDynamic("lengthSegments")(lengthSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthSegments)) __obj.updateDynamic("widthSegments")(widthSegments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HalfExtents]
  }
}

