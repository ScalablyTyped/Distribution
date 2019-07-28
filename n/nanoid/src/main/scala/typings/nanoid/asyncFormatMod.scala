package typings.nanoid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/async/format", JSImport.Namespace)
@js.native
object asyncFormatMod extends js.Object {
  def apply(
    random: js.Function1[/* bytes */ Double, js.Promise[js.Array[Double]]],
    alphabet: String,
    size: Double
  ): js.Promise[String] = js.native
}

