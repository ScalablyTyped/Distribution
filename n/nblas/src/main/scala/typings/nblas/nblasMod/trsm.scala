package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "trsm")
@js.native
object trsm extends js.Object {
  def apply(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE): Unit = js.native
  def apply(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO): Unit = js.native
  def apply(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO, transa: TRANS): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG
  ): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG,
    alpha: Double
  ): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO, transa: TRANS): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG
  ): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG,
    alpha: Double
  ): Unit = js.native
}

