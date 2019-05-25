package typings
package olLib.transformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("apply")
  def apply(transform: Transform, coordinate: olLib.coordinateMod.Coordinate | olLib.pixelMod.Pixel): olLib.coordinateMod.Coordinate | olLib.pixelMod.Pixel = js.native
  def compose(
    transform: Transform,
    dx1: scala.Double,
    dy1: scala.Double,
    sx: scala.Double,
    sy: scala.Double,
    angle: scala.Double,
    dx2: scala.Double,
    dy2: scala.Double
  ): Transform = js.native
  def create(): Transform = js.native
  def determinant(mat: Transform): scala.Double = js.native
  def invert(transform: Transform): Transform = js.native
  def multiply(transform1: Transform, transform2: Transform): Transform = js.native
  def reset(transform: Transform): Transform = js.native
  def rotate(transform: Transform, angle: scala.Double): Transform = js.native
  def scale(transform: Transform, x: scala.Double, y: scala.Double): Transform = js.native
  def set(
    transform: Transform,
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): Transform = js.native
  def setFromArray(transform1: Transform, transform2: Transform): Transform = js.native
  def translate(transform: Transform, dx: scala.Double, dy: scala.Double): Transform = js.native
}

