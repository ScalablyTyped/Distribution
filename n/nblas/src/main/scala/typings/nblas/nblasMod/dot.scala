package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "dot")
@js.native
object dot extends js.Object {
  def apply(x: Float32Array, y: Float32Array): Double = js.native
  def apply(x: Float64Array, y: Float64Array): Double = js.native
}

