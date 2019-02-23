package typings
package mumathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mumath", JSImport.Namespace)
@js.native
object mumathMod extends js.Object {
  def clamp(value: scala.Double, left: scala.Double, right: scala.Double): scala.Double = js.native
  def closest(value: scala.Double, list: js.Array[scala.Double]): scala.Double = js.native
  def isMultiple(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  def isMultiple(a: scala.Double, b: scala.Double, eps: scala.Double): scala.Boolean = js.native
  def len(a: scala.Double, b: scala.Double): scala.Double = js.native
  def lerp(x: scala.Double, y: scala.Double, ratio: scala.Double): scala.Double = js.native
  def mod(value: scala.Double, max: scala.Double): scala.Double = js.native
  def mod(value: scala.Double, max: scala.Double, min: scala.Double): scala.Double = js.native
  def order(value: scala.Double): scala.Double = js.native
  def precision(value: scala.Double): scala.Double = js.native
  def round(value: scala.Double): scala.Double = js.native
  def round(value: scala.Double, step: scala.Double): scala.Double = js.native
  def scale(value: scala.Double, list: js.Array[scala.Double]): scala.Double = js.native
  def within(value: scala.Double, left: scala.Double, right: scala.Double): scala.Double = js.native
}

