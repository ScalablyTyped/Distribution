package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "gemm")
@js.native
object gemm extends js.Object {
  def apply(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, k: Double): Unit = js.native
  def apply(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, k: Double, transa: TRANS): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS
  ): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double
  ): Unit = js.native
  def apply(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double,
    beta: Double
  ): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, k: Double): Unit = js.native
  def apply(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, k: Double, transa: TRANS): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS
  ): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double
  ): Unit = js.native
  def apply(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double,
    beta: Double
  ): Unit = js.native
}

