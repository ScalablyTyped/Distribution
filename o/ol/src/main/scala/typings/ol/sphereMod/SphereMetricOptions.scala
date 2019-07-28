package typings.ol.sphereMod

import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphereMetricOptions extends js.Object {
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object SphereMetricOptions {
  @scala.inline
  def apply(projection: ProjectionLike = null, radius: Int | Double = null): SphereMetricOptions = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphereMetricOptions]
  }
}

