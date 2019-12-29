package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/LineString", JSImport.Namespace)
@js.native
object geomLineStringMod extends js.Object {
  @js.native
  trait LineString
    extends typings.ol.geomSimpleGeometryMod.default {
    def appendCoordinate(coordinate: Coordinate): Unit = js.native
    def forEachSegment[T, S](callback: js.ThisFunction2[/* this */ S, /* p0 */ Coordinate, /* p1 */ Coordinate, T]): T | Boolean = js.native
    def getCoordinateAt(fraction: Double): Coordinate = js.native
    def getCoordinateAt(fraction: Double, opt_dest: Coordinate): Coordinate = js.native
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    def getFlatMidpoint(): js.Array[Double] = js.native
    def getLength(): Double = js.native
  }
  
  @js.native
  class default protected () extends LineString {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
}

