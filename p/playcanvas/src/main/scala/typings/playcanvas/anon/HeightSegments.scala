package typings.playcanvas.anon

import typings.playcanvas.pc.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightSegments extends js.Object {
  var halfExtents: js.UndefOr[Vec3] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var lengthSegments: js.UndefOr[Double] = js.undefined
  var widthSegments: js.UndefOr[Double] = js.undefined
}

object HeightSegments {
  @scala.inline
  def apply(
    halfExtents: Vec3 = null,
    heightSegments: js.UndefOr[Double] = js.undefined,
    lengthSegments: js.UndefOr[Double] = js.undefined,
    widthSegments: js.UndefOr[Double] = js.undefined
  ): HeightSegments = {
    val __obj = js.Dynamic.literal()
    if (halfExtents != null) __obj.updateDynamic("halfExtents")(halfExtents.asInstanceOf[js.Any])
    if (!js.isUndefined(heightSegments)) __obj.updateDynamic("heightSegments")(heightSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lengthSegments)) __obj.updateDynamic("lengthSegments")(lengthSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthSegments)) __obj.updateDynamic("widthSegments")(widthSegments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightSegments]
  }
}

