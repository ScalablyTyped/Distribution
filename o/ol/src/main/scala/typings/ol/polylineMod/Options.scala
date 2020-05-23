package typings.ol.polylineMod

import typings.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
}

object Options {
  @scala.inline
  def apply(factor: js.UndefOr[Double] = js.undefined, geometryLayout: GeometryLayout = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (geometryLayout != null) __obj.updateDynamic("geometryLayout")(geometryLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

