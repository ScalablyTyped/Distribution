package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomLineStringMod {
  
  /**
    * @classdesc
    * Linestring geometry.
    *
    * @api
    */
  @JSImport("ol/geom/LineString", JSImport.Default)
  @js.native
  open class default protected () extends LineString {
    /**
      * @param {Array<import("../coordinate.js").Coordinate>|Array<number>} coordinates Coordinates.
      *     For internal use, flat coordinates in combination with `layout` are also accepted.
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      */
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], layout: GeometryLayout) = this()
  }
  
  /**
    * @classdesc
    * Linestring geometry.
    *
    * @api
    */
  @js.native
  trait LineString
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Append the passed coordinate to the coordinates of the linestring.
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @api
      */
    def appendCoordinate(coordinate: Coordinate): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var flatMidpointRevision_ : Any = js.native
    
    /**
      * @private
      * @type {import("../coordinate.js").Coordinate}
      */
    /* private */ var flatMidpoint_ : Any = js.native
    
    /**
      * Iterate over each segment, calling the provided callback.
      * If the callback returns a truthy value the function returns that
      * value immediately. Otherwise the function returns `false`.
      *
      * @param {function(this: S, import("../coordinate.js").Coordinate, import("../coordinate.js").Coordinate): T} callback Function
      *     called for each segment. The function will receive two arguments, the start and end coordinates of the segment.
      * @return {T|boolean} Value.
      * @template T,S
      * @api
      */
    def forEachSegment[T, S](callback: js.ThisFunction2[/* this */ S, /* arg1 */ Coordinate, /* arg2 */ Coordinate, T]): Boolean | T = js.native
    
    /**
      * Return the coordinate at the provided fraction along the linestring.
      * The `fraction` is a number between 0 and 1, where 0 is the start of the
      * linestring and 1 is the end.
      * @param {number} fraction Fraction.
      * @param {import("../coordinate.js").Coordinate} [dest] Optional coordinate whose values will
      *     be modified. If not provided, a new coordinate will be returned.
      * @return {import("../coordinate.js").Coordinate} Coordinate of the interpolated point.
      * @api
      */
    def getCoordinateAt(fraction: Double): Coordinate = js.native
    def getCoordinateAt(fraction: Double, dest: Coordinate): Coordinate = js.native
    
    /**
      * Returns the coordinate at `m` using linear interpolation, or `null` if no
      * such coordinate exists.
      *
      * `extrapolate` controls extrapolation beyond the range of Ms in the
      * MultiLineString. If `extrapolate` is `true` then Ms less than the first
      * M will return the first coordinate and Ms greater than the last M will
      * return the last coordinate.
      *
      * @param {number} m M.
      * @param {boolean} [extrapolate] Extrapolate. Default is `false`.
      * @return {import("../coordinate.js").Coordinate|null} Coordinate.
      * @api
      */
    def getCoordinateAtM(m: Double): Coordinate | Null = js.native
    def getCoordinateAtM(m: Double, extrapolate: Boolean): Coordinate | Null = js.native
    
    /**
      * @return {Array<number>} Flat midpoint.
      */
    def getFlatMidpoint(): js.Array[Double] = js.native
    
    /**
      * Return the length of the linestring on projected plane.
      * @return {number} Length (on projected plane).
      * @api
      */
    def getLength(): Double = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDeltaRevision_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxDelta_ : Any = js.native
  }
}
