package typings.ol

import typings.ol.circleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/coordinate", JSImport.Namespace)
@js.native
object coordinateMod extends js.Object {
  def add(coordinate: Coordinate, delta: Coordinate): Coordinate = js.native
  def closestOnCircle(coordinate: Coordinate, circle: default): Coordinate = js.native
  def closestOnSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Coordinate = js.native
  def createStringXY(): CoordinateFormat = js.native
  def createStringXY(opt_fractionDigits: Double): CoordinateFormat = js.native
  def degreesToStringHDMS(hemispheres: String, degrees: Double): String = js.native
  def degreesToStringHDMS(hemispheres: String, degrees: Double, opt_fractionDigits: Double): String = js.native
  def distance(coord1: Coordinate, coord2: Coordinate): Double = js.native
  def equals(coordinate1: Coordinate, coordinate2: Coordinate): Boolean = js.native
  def format(coordinate: Coordinate, template: String): String = js.native
  def format(coordinate: Coordinate, template: String, opt_fractionDigits: Double): String = js.native
  def rotate(coordinate: Coordinate, angle: Double): Coordinate = js.native
  def scale(coordinate: Coordinate, scale: Double): Coordinate = js.native
  def squaredDistance(coord1: Coordinate, coord2: Coordinate): Double = js.native
  def squaredDistanceToSegment(coordinate: Coordinate, segment: js.Array[Coordinate]): Double = js.native
  def toStringHDMS(coordinate: Coordinate): String = js.native
  def toStringHDMS(coordinate: Coordinate, opt_fractionDigits: Double): String = js.native
  def toStringXY(coordinate: Coordinate): String = js.native
  def toStringXY(coordinate: Coordinate, opt_fractionDigits: Double): String = js.native
  def wrapX(coordinate: Coordinate, projection: typings.ol.projectionMod.default): Coordinate = js.native
  type Coordinate = js.Array[Double]
  type CoordinateFormat = js.Function1[/* p0 */ js.UndefOr[Coordinate], String]
}

