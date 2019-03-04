package typings
package pinoLib.pinoMod.PNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait redactOptions extends js.Object {
  var censor: js.UndefOr[java.lang.String] = js.undefined
  var paths: js.Array[java.lang.String]
  var remove: js.UndefOr[scala.Boolean] = js.undefined
}

object redactOptions {
  @scala.inline
  def apply(
    paths: js.Array[java.lang.String],
    censor: java.lang.String = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined
  ): redactOptions = {
    val __obj = js.Dynamic.literal(paths = paths)
    if (censor != null) __obj.updateDynamic("censor")(censor)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[redactOptions]
  }
}

