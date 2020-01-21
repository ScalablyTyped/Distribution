package typings.ol

import typings.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/geodesic", JSImport.Namespace)
@js.native
object geodesicMod extends js.Object {
  def greatCircleArc(
    lon1: Double,
    lat1: Double,
    lon2: Double,
    lat2: Double,
    projection: default,
    squaredTolerance: Double
  ): js.Array[Double] = js.native
  def meridian(lon: Double, lat1: Double, lat2: Double, projection: default, squaredTolerance: Double): js.Array[Double] = js.native
  def parallel(lat: Double, lon1: Double, lon2: Double, projection: default, squaredTolerance: Double): js.Array[Double] = js.native
}

