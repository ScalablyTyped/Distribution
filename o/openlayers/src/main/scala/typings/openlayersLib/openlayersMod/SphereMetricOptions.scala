package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SphereMetricOptions extends js.Object {
  /**
       * Projection of the geometry.  By default, the geometry is assumed to be in
       * EPSG:3857 (Web Mercator).
       */
  var projection: js.UndefOr[openlayersLib.openlayersMod.projNs.Projection] = js.undefined
  /**
       * Sphere radius.  By default, the radius of the earth is used (Clarke 1866
       * Authalic Sphere).
       * @api
       */
  var radius: js.UndefOr[scala.Double] = js.undefined
}

