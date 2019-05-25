package typings
package olLib.formatPolylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/Polyline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decodeDeltas(encoded: java.lang.String, stride: scala.Double): js.Array[scala.Double] = js.native
  def decodeDeltas(encoded: java.lang.String, stride: scala.Double, opt_factor: scala.Double): js.Array[scala.Double] = js.native
  def decodeFloats(encoded: java.lang.String): js.Array[scala.Double] = js.native
  def decodeFloats(encoded: java.lang.String, opt_factor: scala.Double): js.Array[scala.Double] = js.native
  def decodeSignedIntegers(encoded: java.lang.String): js.Array[scala.Double] = js.native
  def decodeUnsignedIntegers(encoded: java.lang.String): js.Array[scala.Double] = js.native
  def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double): java.lang.String = js.native
  def encodeDeltas(numbers: js.Array[scala.Double], stride: scala.Double, opt_factor: scala.Double): java.lang.String = js.native
  def encodeFloats(numbers: js.Array[scala.Double]): java.lang.String = js.native
  def encodeFloats(numbers: js.Array[scala.Double], opt_factor: scala.Double): java.lang.String = js.native
  def encodeSignedIntegers(numbers: js.Array[scala.Double]): java.lang.String = js.native
  def encodeUnsignedInteger(num: scala.Double): java.lang.String = js.native
  def encodeUnsignedIntegers(numbers: js.Array[scala.Double]): java.lang.String = js.native
}

