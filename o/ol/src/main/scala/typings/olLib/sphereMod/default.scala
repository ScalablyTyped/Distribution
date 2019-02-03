package typings
package olLib.sphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/sphere", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.Sphere {
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
  def this(radius: scala.Double) = this()
}

/* static members */
@JSImport("ol/sphere", JSImport.Default)
@js.native
object default extends js.Object {
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
  def getArea(geometry: openlayersLib.openlayersMod.geomNs.Geometry): scala.Double = js.native
  def getArea(
    geometry: openlayersLib.openlayersMod.geomNs.Geometry,
    opt_options: openlayersLib.openlayersMod.SphereMetricOptions
  ): scala.Double = js.native
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
  def getLength(geometry: openlayersLib.openlayersMod.geomNs.Geometry): scala.Double = js.native
  def getLength(
    geometry: openlayersLib.openlayersMod.geomNs.Geometry,
    opt_options: openlayersLib.openlayersMod.SphereMetricOptions
  ): scala.Double = js.native
}

