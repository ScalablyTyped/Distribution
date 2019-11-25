package typings.openlayers.openlayersMod.geom

import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Point geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.Point")
@js.native
class Point protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Point geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: Coordinate) = this()
  def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  /**
    * Return the coordinate of the point.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): Coordinate = js.native
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent): Boolean = js.native
  /**
    * Set the coordinate of the point.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: Coordinate): Unit = js.native
  def setCoordinates(coordinates: Coordinate, opt_layout: GeometryLayout): Unit = js.native
}

