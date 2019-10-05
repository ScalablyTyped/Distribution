package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "gemv")
@js.native
object gemv extends js.Object {
  def apply(a: Float32Array, x: Float32Array, y: Float32Array): Unit = js.native
  def apply(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double): Unit = js.native
  def apply(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double, beta: Double): Unit = js.native
  def apply(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double, beta: Double, trans: TRANS): Unit = js.native
  def apply(a: Float64Array, x: Float64Array, y: Float64Array): Unit = js.native
  def apply(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double): Unit = js.native
  def apply(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double, beta: Double): Unit = js.native
  def apply(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double, beta: Double, trans: TRANS): Unit = js.native
}

