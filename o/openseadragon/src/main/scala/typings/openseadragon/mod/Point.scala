package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "Point")
@js.native
class Point () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  @JSName("apply")
  def apply(func: js.Function1[/* v */ Double, Double]): Point = js.native
  def distanceTo(point: Point): Double = js.native
  def divide(factor: Double): Point = js.native
  def equals(point: Point): Boolean = js.native
  def minus(point: Point): Point = js.native
  def negate(): Point = js.native
  def plus(point: Point): Point = js.native
  def rotate(degrees: Double): Point = js.native
  def rotate(degrees: Double, pivot: Point): Point = js.native
  def squaredDistanceTo(point: Point): Double = js.native
  def times(factor: Double): Rect = js.native
}

