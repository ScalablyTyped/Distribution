package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "rotmg")
@js.native
object rotmg extends js.Object {
  def apply(d1: Float32Array, d2: Float32Array, x1: Float32Array, y1: Double, param: Float32Array): Unit = js.native
  def apply(d1: Float64Array, d2: Float64Array, x1: Float64Array, y1: Double, param: Float64Array): Unit = js.native
}

