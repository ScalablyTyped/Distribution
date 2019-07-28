package typings.ol.formatPolylineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/Polyline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decodeDeltas(encoded: String, stride: Double): js.Array[Double] = js.native
  def decodeDeltas(encoded: String, stride: Double, opt_factor: Double): js.Array[Double] = js.native
  def decodeFloats(encoded: String): js.Array[Double] = js.native
  def decodeFloats(encoded: String, opt_factor: Double): js.Array[Double] = js.native
  def decodeSignedIntegers(encoded: String): js.Array[Double] = js.native
  def decodeUnsignedIntegers(encoded: String): js.Array[Double] = js.native
  def encodeDeltas(numbers: js.Array[Double], stride: Double): String = js.native
  def encodeDeltas(numbers: js.Array[Double], stride: Double, opt_factor: Double): String = js.native
  def encodeFloats(numbers: js.Array[Double]): String = js.native
  def encodeFloats(numbers: js.Array[Double], opt_factor: Double): String = js.native
  def encodeSignedIntegers(numbers: js.Array[Double]): String = js.native
  def encodeUnsignedInteger(num: Double): String = js.native
  def encodeUnsignedIntegers(numbers: js.Array[Double]): String = js.native
}

