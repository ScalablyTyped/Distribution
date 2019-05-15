package typings
package nanoidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/async/format", JSImport.Namespace)
@js.native
object asyncFormatMod extends js.Object {
  def apply(
    random: js.Function1[/* bytes */ scala.Double, js.Promise[js.Array[scala.Double]]],
    alphabet: java.lang.String,
    size: scala.Double
  ): js.Promise[java.lang.String] = js.native
}

