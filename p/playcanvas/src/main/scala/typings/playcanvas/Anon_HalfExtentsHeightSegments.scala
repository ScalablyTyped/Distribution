package typings.playcanvas

import typings.playcanvas.pc.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HalfExtentsHeightSegments extends js.Object {
  var halfExtents: js.UndefOr[Vec3] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var lengthSegments: js.UndefOr[Double] = js.undefined
  var widthSegments: js.UndefOr[Double] = js.undefined
}

object Anon_HalfExtentsHeightSegments {
  @scala.inline
  def apply(
    halfExtents: Vec3 = null,
    heightSegments: Int | Double = null,
    lengthSegments: Int | Double = null,
    widthSegments: Int | Double = null
  ): Anon_HalfExtentsHeightSegments = {
    val __obj = js.Dynamic.literal()
    if (halfExtents != null) __obj.updateDynamic("halfExtents")(halfExtents.asInstanceOf[js.Any])
    if (heightSegments != null) __obj.updateDynamic("heightSegments")(heightSegments.asInstanceOf[js.Any])
    if (lengthSegments != null) __obj.updateDynamic("lengthSegments")(lengthSegments.asInstanceOf[js.Any])
    if (widthSegments != null) __obj.updateDynamic("widthSegments")(widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HalfExtentsHeightSegments]
  }
}

