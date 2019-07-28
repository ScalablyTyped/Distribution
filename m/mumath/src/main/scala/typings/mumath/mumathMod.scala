package typings.mumath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mumath", JSImport.Namespace)
@js.native
object mumathMod extends js.Object {
  def clamp(value: Double, left: Double, right: Double): Double = js.native
  def closest(value: Double, list: js.Array[Double]): Double = js.native
  def isMultiple(a: Double, b: Double): Boolean = js.native
  def isMultiple(a: Double, b: Double, eps: Double): Boolean = js.native
  def len(a: Double, b: Double): Double = js.native
  def lerp(x: Double, y: Double, ratio: Double): Double = js.native
  def mod(value: Double, max: Double): Double = js.native
  def mod(value: Double, max: Double, min: Double): Double = js.native
  def order(value: Double): Double = js.native
  def precision(value: Double): Double = js.native
  def round(value: Double): Double = js.native
  def round(value: Double, step: Double): Double = js.native
  def scale(value: Double, list: js.Array[Double]): Double = js.native
  def within(value: Double, left: Double, right: Double): Double = js.native
}

