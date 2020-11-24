package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Linestring geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.LineString")
@js.native
class LineString protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[Coordinate_]) = this()
  def this(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout) = this()
  
  /**
    * Append the passed coordinate to the coordinates of the linestring.
    * @param coordinate Coordinate.
    * @api stable
    */
  def appendCoordinate(coordinate: Coordinate_): Unit = js.native
  
  /**
    * Iterate over each segment, calling the provided callback.
    * If the callback returns a truthy value the function returns that
    * value immediately. Otherwise the function returns `false`.
    *
    * @param callback Function
    *     called for each segment.
    * @param opt_this The object to be used as the value of 'this'
    *     within callback.
    * @return Value.
    * @template T,S
    * @api
    */
  def forEachSegment[T, S](callback: js.ThisFunction2[/* this */ S, /* start */ Coordinate_, /* end */ Coordinate_, T]): T | Boolean = js.native
  def forEachSegment[T, S](
    callback: js.ThisFunction2[/* this */ S, /* start */ Coordinate_, /* end */ Coordinate_, T],
    opt_this: S
  ): T | Boolean = js.native
  
  /**
    * Return the coordinate at the provided fraction along the linestring.
    * The `fraction` is a number between 0 and 1, where 0 is the start of the
    * linestring and 1 is the end.
    * @param fraction Fraction.
    * @param opt_dest Optional coordinate whose values will
    *     be modified. If not provided, a new coordinate will be returned.
    * @return Coordinate of the interpolated point.
    * @api
    */
  def getCoordinateAt(fraction: Double): Coordinate_ = js.native
  def getCoordinateAt(fraction: Double, opt_dest: Coordinate_): Coordinate_ = js.native
  
  /**
    * Returns the coordinate at `m` using linear interpolation, or `null` if no
    * such coordinate exists.
    *
    * `opt_extrapolate` controls extrapolation beyond the range of Ms in the
    * MultiLineString. If `opt_extrapolate` is `true` then Ms less than the first
    * M will return the first coordinate and Ms greater than the last M will
    * return the last coordinate.
    *
    * @param m M.
    * @param opt_extrapolate Extrapolate. Default is `false`.
    * @return Coordinate.
    * @api stable
    */
  def getCoordinateAtM(m: Double): Coordinate_ = js.native
  def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate_ = js.native
  
  /**
    * Return the coordinates of the linestring.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): js.Array[Coordinate_] = js.native
  
  /**
    * Return the length of the linestring on projected plane.
    * @return Length (on projected plane).
    * @api stable
    */
  def getLength(): Double = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the coordinates of the linestring.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[Coordinate_]): Unit = js.native
  def setCoordinates(coordinates: js.Array[Coordinate_], opt_layout: GeometryLayout): Unit = js.native
}
