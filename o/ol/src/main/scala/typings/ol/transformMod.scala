package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import typings.ol.transformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  @JSName("apply")
  def apply(transform: Transform, coordinate: Coordinate | Pixel): Coordinate | Pixel = js.native
  def compose(
    transform: Transform,
    dx1: Double,
    dy1: Double,
    sx: Double,
    sy: Double,
    angle: Double,
    dx2: Double,
    dy2: Double
  ): Transform = js.native
  def create(): Transform = js.native
  def determinant(mat: Transform): Double = js.native
  def invert(transform: Transform): Transform = js.native
  def multiply(transform1: Transform, transform2: Transform): Transform = js.native
  def reset(transform: Transform): Transform = js.native
  def rotate(transform: Transform, angle: Double): Transform = js.native
  def scale(transform: Transform, x: Double, y: Double): Transform = js.native
  def set(transform: Transform, a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Transform = js.native
  def setFromArray(transform1: Transform, transform2: Transform): Transform = js.native
  def translate(transform: Transform, dx: Double, dy: Double): Transform = js.native
  type Transform = js.Array[Double]
}

