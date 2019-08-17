package typings.numeric.numericMod

import typings.numeric.Scalar
import typings.numeric.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spline extends js.Object {
  var kl: Vector = js.native
  var kr: Vector = js.native
  var x: Vector = js.native
  var yl: Vector = js.native
  var yr: Vector = js.native
  def at(x0: Scalar): Vector | Scalar = js.native
  def at(x0: Vector): Vector | Scalar = js.native
  def diff(): Spline = js.native
  def roots(): Vector = js.native
}

