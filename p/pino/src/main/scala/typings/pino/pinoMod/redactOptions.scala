package typings.pino.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait redactOptions extends js.Object {
  var censor: js.UndefOr[String] = js.undefined
  var paths: js.Array[String]
  var remove: js.UndefOr[Boolean] = js.undefined
}

object redactOptions {
  @scala.inline
  def apply(paths: js.Array[String], censor: String = null, remove: js.UndefOr[Boolean] = js.undefined): redactOptions = {
    val __obj = js.Dynamic.literal(paths = paths)
    if (censor != null) __obj.updateDynamic("censor")(censor)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[redactOptions]
  }
}

