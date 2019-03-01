package typings
package nodeDashJoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowEmbeddedKey: js.UndefOr[scala.Boolean] = js.undefined
  var handlers: js.UndefOr[js.Any] = js.undefined
}

object Anon_Algorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[java.lang.String] = null,
    allowEmbeddedKey: js.UndefOr[scala.Boolean] = js.undefined,
    handlers: js.Any = null
  ): Anon_Algorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (!js.isUndefined(allowEmbeddedKey)) __obj.updateDynamic("allowEmbeddedKey")(allowEmbeddedKey)
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    __obj.asInstanceOf[Anon_Algorithms]
  }
}

