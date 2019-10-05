package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "rot")
@js.native
object rot extends js.Object {
  def apply(x: Float32Array, y: Float32Array, c: Double, s: Double): Unit = js.native
  def apply(x: Float64Array, y: Float64Array, c: Double, s: Double): Unit = js.native
}

