package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "syrk")
@js.native
object syrk extends js.Object {
  def apply(a: Float32Array, c: Float32Array, n: Double, k: Double): Unit = js.native
  def apply(a: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO): Unit = js.native
  def apply(a: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO, trans: TRANS): Unit = js.native
  def apply(a: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO, trans: TRANS, alpha: Double): Unit = js.native
  def apply(
    a: Float32Array,
    c: Float32Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double,
    beta: Double
  ): Unit = js.native
  def apply(a: Float64Array, c: Float64Array, n: Double, k: Double): Unit = js.native
  def apply(a: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO): Unit = js.native
  def apply(a: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO, trans: TRANS): Unit = js.native
  def apply(a: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO, trans: TRANS, alpha: Double): Unit = js.native
  def apply(
    a: Float64Array,
    c: Float64Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double,
    beta: Double
  ): Unit = js.native
}

