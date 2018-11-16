package typings
package olLib.geomPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * Polygon geometry.
     *
     * @param coordinates Coordinates.
     * @param opt_layout Layout.
     * @api stable
     */
@JSImport("ol/geom/polygon", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.geomNs.Polygon {
  /**
           * @classdesc
           * Polygon geometry.
           *
           * @param coordinates Coordinates.
           * @param opt_layout Layout.
           * @api stable
           */
  def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]]) = this()
  /**
           * @classdesc
           * Polygon geometry.
           *
           * @param coordinates Coordinates.
           * @param opt_layout Layout.
           * @api stable
           */
  def this(coordinates: js.Array[js.Array[openlayersLib.openlayersMod.Coordinate]], opt_layout: openlayersLib.openlayersMod.geomNs.GeometryLayout) = this()
}

/**
     * @classdesc
     * Polygon geometry.
     *
     * @param coordinates Coordinates.
     * @param opt_layout Layout.
     * @api stable
     */
@JSImport("ol/geom/polygon", JSImport.Default)
@js.native
object default extends js.Object {
  /**
           * Create an approximation of a circle on the surface of a sphere.
           * @param sphere The sphere.
           * @param center Center (`[lon, lat]` in degrees).
           * @param radius The great-circle distance from the center to
           *     the polygon vertices.
           * @param opt_n Optional number of vertices for the resulting
           *     polygon. Default is `32`.
           * @return The "circular" polygon.
           * @api stable
           */
  def circular(
    sphere: openlayersLib.openlayersMod.Sphere,
    center: openlayersLib.openlayersMod.Coordinate,
    radius: scala.Double
  ): openlayersLib.openlayersMod.geomNs.Polygon = js.native
  /**
           * Create an approximation of a circle on the surface of a sphere.
           * @param sphere The sphere.
           * @param center Center (`[lon, lat]` in degrees).
           * @param radius The great-circle distance from the center to
           *     the polygon vertices.
           * @param opt_n Optional number of vertices for the resulting
           *     polygon. Default is `32`.
           * @return The "circular" polygon.
           * @api stable
           */
  def circular(
    sphere: openlayersLib.openlayersMod.Sphere,
    center: openlayersLib.openlayersMod.Coordinate,
    radius: scala.Double,
    opt_n: scala.Double
  ): openlayersLib.openlayersMod.geomNs.Polygon = js.native
  /**
           * Create a regular polygon from a circle.
           * @param circle Circle geometry.
           * @param opt_sides Number of sides of the polygon. Default is 32.
           * @param opt_angle Start angle for the first vertex of the polygon in
           *     radians. Default is 0.
           * @return Polygon geometry.
           * @api
           */
  def fromCircle(circle: openlayersLib.openlayersMod.geomNs.Circle): openlayersLib.openlayersMod.geomNs.Polygon = js.native
  /**
           * Create a regular polygon from a circle.
           * @param circle Circle geometry.
           * @param opt_sides Number of sides of the polygon. Default is 32.
           * @param opt_angle Start angle for the first vertex of the polygon in
           *     radians. Default is 0.
           * @return Polygon geometry.
           * @api
           */
  def fromCircle(circle: openlayersLib.openlayersMod.geomNs.Circle, opt_sides: scala.Double): openlayersLib.openlayersMod.geomNs.Polygon = js.native
  /**
           * Create a regular polygon from a circle.
           * @param circle Circle geometry.
           * @param opt_sides Number of sides of the polygon. Default is 32.
           * @param opt_angle Start angle for the first vertex of the polygon in
           *     radians. Default is 0.
           * @return Polygon geometry.
           * @api
           */
  def fromCircle(
    circle: openlayersLib.openlayersMod.geomNs.Circle,
    opt_sides: scala.Double,
    opt_angle: scala.Double
  ): openlayersLib.openlayersMod.geomNs.Polygon = js.native
  /**
           * Create a polygon from an extent. The layout used is `XY`.
           * @param extent The extent.
           * @return The polygon.
           * @api
           */
  def fromExtent(extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.geomNs.Polygon = js.native
}

