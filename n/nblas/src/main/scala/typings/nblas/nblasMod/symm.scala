package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "symm")
@js.native
object symm extends js.Object {
  def apply(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, side: SIDE): Unit = js.native
  def apply(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double
  ): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double,
    beta: Double
  ): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, side: SIDE): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double
  ): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double,
    beta: Double
  ): Unit = js.native
}

