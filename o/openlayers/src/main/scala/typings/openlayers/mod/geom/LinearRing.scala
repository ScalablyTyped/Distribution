package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(coordinates: js.Array[Coordinate_]) = this()
  def this(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout) = this()
  
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
  def getCoordinates(): js.Array[Coordinate_] = js.native
  
  /**
    * Set the coordinates of the linear ring.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[Coordinate_]): Unit = js.native
  def setCoordinates(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout): Unit = js.native
}
