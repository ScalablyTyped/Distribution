package typings.nblas.nblasMod

import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", "scal")
@js.native
object scal extends js.Object {
  def apply(x: Float32Array, alpha: Double): Unit = js.native
  def apply(x: Float64Array, alpha: Double): Unit = js.native
}

