package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Sphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Polygon geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.Polygon")
@js.native
class Polygon protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[js.Array[Coordinate_]]) = this()
  def this(coordinates: js.Array[js.Array[Coordinate_]], opt_layout: GeometryLayout) = this()
  
  /**
    * Append the passed linear ring to this polygon.
    * @param linearRing Linear ring.
    * @api stable
    */
  def appendLinearRing(linearRing: LinearRing): Unit = js.native
  
  /**
    * Return the area of the polygon on projected plane.
    * @return Area (on projected plane).
    * @api stable
    */
  def getArea(): Double = js.native
  
  /**
    * Get the coordinate array for this geometry.  This array has the structure
    * of a GeoJSON coordinate array for polygons.
    *
    * @param opt_right Orient coordinates according to the right-hand
    *     rule (counter-clockwise for exterior and clockwise for interior rings).
    *     If `false`, coordinates will be oriented according to the left-hand rule
    *     (clockwise for exterior and counter-clockwise for interior rings).
    *     By default, coordinate orientation will depend on how the geometry was
    *     constructed.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): js.Array[js.Array[Coordinate_]] = js.native
  def getCoordinates(opt_right: Boolean): js.Array[js.Array[Coordinate_]] = js.native
  
  /**
    * Return an interior point of the polygon.
    * @return Interior point.
    * @api stable
    */
  def getInteriorPoint(): Point = js.native
  
  /**
    * Return the Nth linear ring of the polygon geometry. Return `null` if the
    * given index is out of range.
    * The exterior linear ring is available at index `0` and the interior rings
    * at index `1` and beyond.
    *
    * @param index Index.
    * @return Linear ring.
    * @api stable
    */
  def getLinearRing(index: Double): LinearRing = js.native
  
  /**
    * Return the number of rings of the polygon,  this includes the exterior
    * ring and any interior rings.
    *
    * @return Number of rings.
    * @api
    */
  def getLinearRingCount(): Double = js.native
  
  /**
    * Return the linear rings of the polygon.
    * @return Linear rings.
    * @api stable
    */
  def getLinearRings(): js.Array[LinearRing] = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the coordinates of the polygon.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[js.Array[Coordinate_]]): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Coordinate_]], opt_layout: GeometryLayout): Unit = js.native
}
/* static members */
@JSImport("openlayers", "geom.Polygon")
@js.native
object Polygon extends js.Object {
  
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
  def circular(sphere: Sphere, center: Coordinate_, radius: Double): Polygon = js.native
  def circular(sphere: Sphere, center: Coordinate_, radius: Double, opt_n: Double): Polygon = js.native
  
  /**
    * Create a regular polygon from a circle.
    * @param circle Circle geometry.
    * @param opt_sides Number of sides of the polygon. Default is 32.
    * @param opt_angle Start angle for the first vertex of the polygon in
    *     radians. Default is 0.
    * @return Polygon geometry.
    * @api
    */
  def fromCircle(circle: Circle): Polygon = js.native
  def fromCircle(circle: Circle, opt_sides: js.UndefOr[scala.Nothing], opt_angle: Double): Polygon = js.native
  def fromCircle(circle: Circle, opt_sides: Double): Polygon = js.native
  def fromCircle(circle: Circle, opt_sides: Double, opt_angle: Double): Polygon = js.native
  
  /**
    * Create a polygon from an extent. The layout used is `XY`.
    * @param extent The extent.
    * @return The polygon.
    * @api
    */
  def fromExtent(extent: Extent_): Polygon = js.native
}
