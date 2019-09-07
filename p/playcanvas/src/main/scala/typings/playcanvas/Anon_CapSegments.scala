package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapSegments extends js.Object {
  var capSegments: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var heightSegments: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object Anon_CapSegments {
  @scala.inline
  def apply(
    capSegments: Int | Double = null,
    height: Int | Double = null,
    heightSegments: Int | Double = null,
    radius: Int | Double = null
  ): Anon_CapSegments = {
    val __obj = js.Dynamic.literal()
    if (capSegments != null) __obj.updateDynamic("capSegments")(capSegments.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightSegments != null) __obj.updateDynamic("heightSegments")(heightSegments.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CapSegments]
  }
}

