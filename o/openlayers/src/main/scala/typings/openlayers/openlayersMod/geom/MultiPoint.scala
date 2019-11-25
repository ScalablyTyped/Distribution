package typings.openlayers.openlayersMod.geom

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Multi-point geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.MultiPoint")
@js.native
class MultiPoint protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Multi-point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[Coordinate]) = this()
  def this(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout) = this()
  /**
    * Append the passed point to this multipoint.
    * @param point Point.
    * @api stable
    */
  def appendPoint(point: Point): Unit = js.native
  /**
    * Return the coordinates of the multipoint.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): js.Array[Coordinate] = js.native
  /**
    * Return the point at the specified index.
    * @param index Index.
    * @return Point.
    * @api stable
    */
  def getPoint(index: Double): Point = js.native
  /**
    * Return the points of this multipoint.
    * @return Points.
    * @api stable
    */
  def getPoints(): js.Array[Point] = js.native
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent): Boolean = js.native
  /**
    * Set the coordinates of the multipoint.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[Coordinate]): Unit = js.native
  def setCoordinates(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout): Unit = js.native
}

