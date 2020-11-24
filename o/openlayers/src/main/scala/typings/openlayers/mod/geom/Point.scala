package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(coordinates: Coordinate_) = this()
  def this(coordinates: Coordinate_, opt_layout: GeometryLayout) = this()
  
  /**
    * Return the coordinate of the point.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): Coordinate_ = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the coordinate of the point.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: Coordinate_): Unit = js.native
  def setCoordinates(coordinates: Coordinate_, opt_layout: GeometryLayout): Unit = js.native
}
