package typings
package olLib.coordinateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/coordinate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(coordinate: Coordinate, delta: Coordinate): Coordinate = js.native
  def closestOnCircle(coordinate: Coordinate, circle: olLib.geomCircleMod.default): Coordinate = js.native
  def closestOnSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Coordinate = js.native
  def createStringXY(): CoordinateFormat = js.native
  def createStringXY(opt_fractionDigits: scala.Double): CoordinateFormat = js.native
  def degreesToStringHDMS(hemispheres: java.lang.String, degrees: scala.Double): java.lang.String = js.native
  def degreesToStringHDMS(hemispheres: java.lang.String, degrees: scala.Double, opt_fractionDigits: scala.Double): java.lang.String = js.native
  def distance(coord1: Coordinate, coord2: Coordinate): scala.Double = js.native
  def equals(coordinate1: Coordinate, coordinate2: Coordinate): scala.Boolean = js.native
  def format(coordinate: Coordinate, template: java.lang.String): java.lang.String = js.native
  def format(coordinate: Coordinate, template: java.lang.String, opt_fractionDigits: scala.Double): java.lang.String = js.native
  def rotate(coordinate: Coordinate, angle: scala.Double): Coordinate = js.native
  def scale(coordinate: Coordinate, scale: scala.Double): Coordinate = js.native
  def squaredDistance(coord1: Coordinate, coord2: Coordinate): scala.Double = js.native
  def squaredDistanceToSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): scala.Double = js.native
  def toStringHDMS(coordinate: Coordinate): java.lang.String = js.native
  def toStringHDMS(coordinate: Coordinate, opt_fractionDigits: scala.Double): java.lang.String = js.native
  def toStringXY(coordinate: Coordinate): java.lang.String = js.native
  def toStringXY(coordinate: Coordinate, opt_fractionDigits: scala.Double): java.lang.String = js.native
}

