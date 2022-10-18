package typings.ol

import typings.ol.projProjectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatGeodesicMod {
  
  @JSImport("ol/geom/flat/geodesic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def greatCircleArc(
    lon1: Double,
    lat1: Double,
    lon2: Double,
    lat2: Double,
    projection: default,
    squaredTolerance: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("greatCircleArc")(lon1.asInstanceOf[js.Any], lat1.asInstanceOf[js.Any], lon2.asInstanceOf[js.Any], lat2.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def meridian(lon: Double, lat1: Double, lat2: Double, projection: default, squaredTolerance: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("meridian")(lon.asInstanceOf[js.Any], lat1.asInstanceOf[js.Any], lat2.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def parallel(lat: Double, lon1: Double, lon2: Double, projection: default, squaredTolerance: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(lat.asInstanceOf[js.Any], lon1.asInstanceOf[js.Any], lon2.asInstanceOf[js.Any], projection.asInstanceOf[js.Any], squaredTolerance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
