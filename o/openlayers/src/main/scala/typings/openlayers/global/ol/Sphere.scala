package typings.openlayers.global.ol

import typings.openlayers.mod.SphereMetricOptions
import typings.openlayers.mod.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Sphere")
@js.native
class Sphere protected ()
  extends typings.openlayers.mod.Sphere {
  /**
    * @classdesc
    * Class to create objects that can be used with {@link
    * ol.geom.Polygon.circular}.
    *
    * For example to create a sphere whose radius is equal to the semi-major
    * axis of the WGS84 ellipsoid:
    *
    * ```js
    * var wgs84Sphere= new ol.Sphere(6378137);
    * ```
    *
    * @param radius Radius.
    * @api
    */
  def this(radius: Double) = this()
}
/* static members */
object Sphere {
  
  @JSGlobal("ol.Sphere")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the spherical area of a geometry.  This is the area (in meters) assuming
    * that polygon edges are segments of great circles on a sphere.
    * @param geometry A geometry.
    * @param opt_options Options for the area
    *     calculation.  By default, geometries are assumed to be in 'EPSG:3857'.
    *     You can change this by providing a `projection` option.
    * @return The spherical area (in square meters).
    * @api
    */
  inline def getArea(geometry: Geometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getArea(geometry: Geometry, opt_options: SphereMetricOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getArea")(geometry.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Get the spherical length of a geometry.  This length is the sum of the
    * great circle distances between coordinates.  For polygons, the length is
    * the sum of all rings.  For points, the length is zero.  For multi-part
    * geometries, the length is the sum of the length of each part.
    * @param geometry A geometry.
    * @param opt_options Options for the length
    *     calculation.  By default, geometries are assumed to be in 'EPSG:3857'.
    *     You can change this by providing a `projection` option.
    * @return The spherical length (in meters).
    * @api
    */
  inline def getLength(geometry: Geometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(geometry.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getLength(geometry: Geometry, opt_options: SphereMetricOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLength")(geometry.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Double]
}
