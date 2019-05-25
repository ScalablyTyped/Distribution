package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/geodesic", JSImport.Namespace)
@js.native
object geomFlatGeodesicMod extends js.Object {
  def greatCircleArc(
    lon1: scala.Double,
    lat1: scala.Double,
    lon2: scala.Double,
    lat2: scala.Double,
    projection: olLib.projProjectionMod.default,
    squaredTolerance: scala.Double
  ): js.Array[scala.Double] = js.native
  def meridian(
    lon: scala.Double,
    lat1: scala.Double,
    lat2: scala.Double,
    projection: olLib.projProjectionMod.default,
    squaredTolerance: scala.Double
  ): js.Array[scala.Double] = js.native
  def parallel(
    lat: scala.Double,
    lon1: scala.Double,
    lon2: scala.Double,
    projection: olLib.projProjectionMod.default,
    squaredTolerance: scala.Double
  ): js.Array[scala.Double] = js.native
}

