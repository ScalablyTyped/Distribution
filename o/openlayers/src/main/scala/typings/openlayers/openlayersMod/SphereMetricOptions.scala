package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.projNs.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphereMetricOptions extends js.Object {
  /**
    * Projection of the geometry.  By default, the geometry is assumed to be in
    * EPSG:3857 (Web Mercator).
    */
  var projection: js.UndefOr[Projection] = js.undefined
  /**
    * Sphere radius.  By default, the radius of the earth is used (Clarke 1866
    * Authalic Sphere).
    * @api
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object SphereMetricOptions {
  @scala.inline
  def apply(projection: Projection = null, radius: Int | Double = null): SphereMetricOptions = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphereMetricOptions]
  }
}

