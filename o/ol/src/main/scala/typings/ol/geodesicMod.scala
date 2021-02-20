package typings.ol

import typings.ol.projectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geodesicMod {
  
  @JSImport("ol/geom/flat/geodesic", "greatCircleArc")
  @js.native
  def greatCircleArc(
    lon1: Double,
    lat1: Double,
    lon2: Double,
    lat2: Double,
    projection: default,
    squaredTolerance: Double
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/geodesic", "meridian")
  @js.native
  def meridian(lon: Double, lat1: Double, lat2: Double, projection: default, squaredTolerance: Double): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/geodesic", "parallel")
  @js.native
  def parallel(lat: Double, lon1: Double, lon2: Double, projection: default, squaredTolerance: Double): js.Array[Double] = js.native
}
