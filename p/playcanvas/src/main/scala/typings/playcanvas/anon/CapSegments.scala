package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapSegments extends js.Object {
  var capSegments: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object CapSegments {
  @scala.inline
  def apply(
    capSegments: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    heightSegments: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined
  ): CapSegments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSegments)) __obj.updateDynamic("capSegments")(capSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightSegments)) __obj.updateDynamic("heightSegments")(heightSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapSegments]
  }
}

