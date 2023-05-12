package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMultiLineStringMod {
  
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @api
    */
  @JSImport("ol/geom/MultiLineString", JSImport.Default)
  @js.native
  open class default protected () extends MultiLineString {
    /**
      * @param {Array<Array<import("../coordinate.js").Coordinate>|LineString>|Array<number>} coordinates
      *     Coordinates or LineString geometries. (For internal use, flat coordinates in
      *     combination with `layout` and `ends` are also accepted.)
      * @param {import("./Geometry.js").GeometryLayout} [layout] Layout.
      * @param {Array<number>} [ends] Flat coordinate ends for internal use.
      */
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      layout: Unit,
      ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.geomLineStringMod.default],
      layout: GeometryLayout,
      ends: js.Array[Double]
    ) = this()
  }
  
  /**
    * @classdesc
    * Multi-linestring geometry.
    *
    * @api
    */
  @js.native
  trait MultiLineString
    extends typings.ol.geomSimpleGeometryMod.default {
    
    /**
      * Append the passed linestring to the multilinestring.
      * @param {LineString} lineString LineString.
      * @api
      */
    def appendLineString(lineString: typings.ol.geomLineStringMod.default): Unit = js.native
    
    /**
      * @type {Array<number>}
      * @private
      */
    /* private */ var ends_ : Any = js.native
    
    /**
      * Returns the coordinate at `m` using linear interpolation, or `null` if no
      * such coordinate exists.
      *
      * `extrapolate` controls extrapolation beyond the range of Ms in the
      * MultiLineString. If `extrapolate` is `true` then Ms less than the first
      * M will return the first coordinate and Ms greater than the last M will
      * return the last coordinate.
      *
      * `interpolate` controls interpolation between consecutive LineStrings
      * within the MultiLineString. If `interpolate` is `true` the coordinates
      * will be linearly interpolated between the last coordinate of one LineString
      * and the first coordinate of the next LineString.  If `interpolate` is
      * `false` then the function will return `null` for Ms falling between
      * LineStrings.
      *
      * @param {number} m M.
      * @param {boolean} [extrapolate] Extrapolate. Default is `false`.
      * @param {boolean} [interpolate] Interpolate. Default is `false`.
      * @return {import("../coordinate.js").Coordinate|null} Coordinate.
      * @api
      */
    def getCoordinateAtM(m: Double): Coordinate | Null = js.native
    def getCoordinateAtM(m: Double, extrapolate: Boolean): Coordinate | Null = js.native
    def getCoordinateAtM(m: Double, extrapolate: Boolean, interpolate: Boolean): Coordinate | Null = js.native
    def getCoordinateAtM(m: Double, extrapolate: Unit, interpolate: Boolean): Coordinate | Null = js.native
    
    /**
      * @return {Array<number>} Ends.
      */
    def getEnds(): js.Array[Double] = js.native
    
    /**
      * @return {Array<number>} Flat midpoints.
      */
    def getFlatMidpoints(): js.Array[Double] = js.native
    
    /**
      * Return the linestring at the specified index.
      * @param {number} index Index.
      * @return {LineString} LineString.
      * @api
      */
    def getLineString(index: Double): typings.ol.geomLineStringMod.default = js.native
    
    /**
      * Return the linestrings of this multilinestring.
      * @return {Array<LineString>} LineStrings.
      * @api
      */
    def getLineStrings(): js.Array[typings.ol.geomLineStringMod.default] = js.native
    
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
