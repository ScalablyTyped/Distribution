package typings.playcanvas

import typings.playcanvas.pc.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HalfExtents extends js.Object {
  var halfExtents: js.UndefOr[Vec2] = js.undefined
  var lengthSegments: js.UndefOr[Double] = js.undefined
  var widthSegments: js.UndefOr[Double] = js.undefined
}

object Anon_HalfExtents {
  @scala.inline
  def apply(halfExtents: Vec2 = null, lengthSegments: Int | Double = null, widthSegments: Int | Double = null): Anon_HalfExtents = {
    val __obj = js.Dynamic.literal()
    if (halfExtents != null) __obj.updateDynamic("halfExtents")(halfExtents.asInstanceOf[js.Any])
    if (lengthSegments != null) __obj.updateDynamic("lengthSegments")(lengthSegments.asInstanceOf[js.Any])
    if (widthSegments != null) __obj.updateDynamic("widthSegments")(widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HalfExtents]
  }
}

