package typings.openlayers.openlayersMod.geom

import typings.openlayers.openlayersMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Linear ring geometry. Only used as part of polygon; cannot be rendered
  * on its own.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.LinearRing")
@js.native
class LinearRing protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Linear ring geometry. Only used as part of polygon; cannot be rendered
    * on its own.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[Coordinate]) = this()
  def this(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout) = this()
  /**
    * Return the area of the linear ring on projected plane.
    * @return Area (on projected plane).
    * @api stable
    */
  def getArea(): Double = js.native
  /**
    * Return the coordinates of the linear ring.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): js.Array[Coordinate] = js.native
  /**
    * Set the coordinates of the linear ring.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[Coordinate]): Unit = js.native
  def setCoordinates(coordinates: js.Array[Coordinate], opt_layout: GeometryLayout): Unit = js.native
}

