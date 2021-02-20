package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiLineStringMod {
  
  @JSImport("ol/geom/MultiLineString", JSImport.Default)
  @js.native
  class default protected () extends MultiLineString {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typings.ol.lineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @js.native
  trait MultiLineString
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Append the passed linestring to the multilinestring.
      */
    def appendLineString(lineString: typings.ol.lineStringMod.default): Unit = js.native
    
    /**
      * Returns the coordinate at m using linear interpolation, or null if no
      * such coordinate exists.
      * opt_extrapolate controls extrapolation beyond the range of Ms in the
      * MultiLineString. If opt_extrapolate is true then Ms less than the first
      * M will return the first coordinate and Ms greater than the last M will
      * return the last coordinate.
      * opt_interpolate controls interpolation between consecutive LineStrings
      * within the MultiLineString. If opt_interpolate is true the coordinates
      * will be linearly interpolated between the last coordinate of one LineString
      * and the first coordinate of the next LineString.  If opt_interpolate is
      * false then the function will return null for Ms falling between
      * LineStrings.
      */
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: js.UndefOr[scala.Nothing], opt_interpolate: Boolean): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean, opt_interpolate: Boolean): Coordinate = js.native
    
    def getEnds(): js.Array[Double] = js.native
    
    def getFlatMidpoints(): js.Array[Double] = js.native
    
    /**
      * Return the linestring at the specified index.
      */
    def getLineString(index: Double): typings.ol.lineStringMod.default = js.native
    
    /**
      * Return the linestrings of this multilinestring.
      */
    def getLineStrings(): js.Array[typings.ol.lineStringMod.default] = js.native
  }
}
