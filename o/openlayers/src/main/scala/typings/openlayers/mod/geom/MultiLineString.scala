package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Multi-linestring geometry.
  *
  * @param coordinates Coordinates.
  * @param opt_layout Layout.
  * @api stable
  */
@JSImport("openlayers", "geom.MultiLineString")
@js.native
class MultiLineString protected () extends SimpleGeometry {
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def this(coordinates: js.Array[js.Array[Coordinate_]]) = this()
  def this(coordinates: js.Array[js.Array[Coordinate_]], opt_layout: GeometryLayout) = this()
  
  /**
    * Append the passed linestring to the multilinestring.
    * @param lineString LineString.
    * @api stable
    */
  def appendLineString(lineString: LineString): Unit = js.native
  
  /**
    * Returns the coordinate at `m` using linear interpolation, or `null` if no
    * such coordinate exists.
    *
    * `opt_extrapolate` controls extrapolation beyond the range of Ms in the
    * MultiLineString. If `opt_extrapolate` is `true` then Ms less than the first
    * M will return the first coordinate and Ms greater than the last M will
    * return the last coordinate.
    *
    * `opt_interpolate` controls interpolation between consecutive LineStrings
    * within the MultiLineString. If `opt_interpolate` is `true` the coordinates
    * will be linearly interpolated between the last coordinate of one LineString
    * and the first coordinate of the next LineString.  If `opt_interpolate` is
    * `false` then the function will return `null` for Ms falling between
    * LineStrings.
    *
    * @param m M.
    * @param opt_extrapolate Extrapolate. Default is `false`.
    * @param opt_interpolate Interpolate. Default is `false`.
    * @return Coordinate.
    * @api stable
    */
  def getCoordinateAtM(m: Double): Coordinate_ = js.native
  def getCoordinateAtM(m: Double, opt_extrapolate: js.UndefOr[scala.Nothing], opt_interpolate: Boolean): Coordinate_ = js.native
  def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate_ = js.native
  def getCoordinateAtM(m: Double, opt_extrapolate: Boolean, opt_interpolate: Boolean): Coordinate_ = js.native
  
  /**
    * Return the coordinates of the multilinestring.
    * @return Coordinates.
    * @api stable
    */
  def getCoordinates(): js.Array[js.Array[Coordinate_]] = js.native
  
  /**
    * Return the linestring at the specified index.
    * @param index Index.
    * @return LineString.
    * @api stable
    */
  def getLineString(index: Double): LineString = js.native
  
  /**
    * Return the linestrings of this multilinestring.
    * @return LineStrings.
    * @api stable
    */
  def getLineStrings(): js.Array[LineString] = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the coordinates of the multilinestring.
    * @param coordinates Coordinates.
    * @param opt_layout Layout.
    * @api stable
    */
  def setCoordinates(coordinates: js.Array[js.Array[Coordinate_]]): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Coordinate_]], opt_layout: GeometryLayout): Unit = js.native
}
