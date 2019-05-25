package typings
package olLib.sphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphereMetricOptions extends js.Object {
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object SphereMetricOptions {
  @scala.inline
  def apply(projection: olLib.projMod.ProjectionLike = null, radius: scala.Int | scala.Double = null): SphereMetricOptions = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphereMetricOptions]
  }
}

