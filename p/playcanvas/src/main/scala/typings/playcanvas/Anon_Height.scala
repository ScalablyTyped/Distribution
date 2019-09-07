package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sides: js.UndefOr[Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: Int | Double = null,
    heightSegments: Int | Double = null,
    radius: Int | Double = null,
    sides: Int | Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightSegments != null) __obj.updateDynamic("heightSegments")(heightSegments.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sides != null) __obj.updateDynamic("sides")(sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

