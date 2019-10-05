package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "spr2")
@js.native
object spr2 extends js.Object {
  def apply(ap: Float32Array, x: Float32Array, y: Float32Array): Unit = js.native
  def apply(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO): Unit = js.native
  def apply(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double): Unit = js.native
  def apply(ap: Float64Array, x: Float64Array, y: Float64Array): Unit = js.native
  def apply(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO): Unit = js.native
  def apply(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double): Unit = js.native
}

