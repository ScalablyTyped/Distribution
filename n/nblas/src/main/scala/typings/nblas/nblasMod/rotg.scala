package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "rotg")
@js.native
object rotg extends js.Object {
  def apply(x: Float32Array, y: Float32Array, c: Float32Array, s: Float32Array): Unit = js.native
  def apply(x: Float64Array, y: Float64Array, c: Float64Array, s: Float64Array): Unit = js.native
}

