package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Multi-polygon geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.MultiPolygon")
@js.native
class MultiPolygon protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Multi-polygon geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[js.Array[js.Array[Coordinate_]]]) = this()
  def this(coordinates: js.Array[js.Array[js.Array[Coordinate_]]], opt_layout: GeometryLayout) = this()
  
  /**
    * Append the passed polygon to this multipolygon.
    * @param polygon Polygon.
    * @api stable
    */
  def appendPolygon(polygon: Polygon): Unit = js.native
  
  /**
    * Return the area of the multipolygon on projected plane.
    * @return Area (on projected plane).
    * @api stable
    */
  def getArea(): Double = js.native
  
  /**
    * Get the coordinate array for this geometry.  This array has the structure
    * of a GeoJSON coordinate array for multi-polygons.
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
  def getCoordinates(): js.Array[js.Array[js.Array[Coordinate_]]] = js.native
  def getCoordinates(opt_right: Boolean): js.Array[js.Array[js.Array[Coordinate_]]] = js.native
  
  /**
    * Return the interior points as {@link MultiPoint multipoint}.
    * @return Interior points.
    * @api stable
    */
  def getInteriorPoints(): MultiPoint = js.native
  
  /**
    * Return the polygon at the specified index.
    * @param index Index.
    * @return Polygon.
    * @api stable
    */
  def getPolygon(index: Double): Polygon = js.native
  
  /**
    * Return the polygons of this multipolygon.
    * @return Polygons.
    * @api stable
    */
  def getPolygons(): js.Array[Polygon] = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the coordinates of the multipolygon.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Coordinate_]]]): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Coordinate_]]], opt_layout: GeometryLayout): Unit = js.native
}
