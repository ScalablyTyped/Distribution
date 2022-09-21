package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineStringMod {
  
  @JSImport("ol/geom/LineString", JSImport.Default)
  @js.native
  open class default protected () extends LineString {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  trait LineString
    extends typings.ol.simpleGeometryMod.default {
    
    /**
      * Append the passed coordinate to the coordinates of the linestring.
      */
    def appendCoordinate(coordinate: Coordinate): Unit = js.native
    
    /**
      * Iterate over each segment, calling the provided callback.
      * If the callback returns a truthy value the function returns that
      * value immediately. Otherwise the function returns false.
      */
    def forEachSegment[T, S](callback: js.ThisFunction2[/* this */ S, /* p0 */ Coordinate, /* p1 */ Coordinate, T]): T | Boolean = js.native
    
    /**
      * Return the coordinate at the provided fraction along the linestring.
      * The fraction is a number between 0 and 1, where 0 is the start of the
      * linestring and 1 is the end.
      */
    def getCoordinateAt(fraction: Double): Coordinate = js.native
    def getCoordinateAt(fraction: Double, opt_dest: Coordinate): Coordinate = js.native
    
    /**
      * Returns the coordinate at m using linear interpolation, or null if no
      * such coordinate exists.
      * opt_extrapolate controls extrapolation beyond the range of Ms in the
      * MultiLineString. If opt_extrapolate is true then Ms less than the first
      * M will return the first coordinate and Ms greater than the last M will
      * return the last coordinate.
      */
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    
    def getFlatMidpoint(): js.Array[Double] = js.native
    
    /**
      * Return the length of the linestring on projected plane.
      */
    def getLength(): Double = js.native
  }
}
