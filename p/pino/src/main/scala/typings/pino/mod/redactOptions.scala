package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait redactOptions extends js.Object {
  var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, _])] = js.undefined
  var paths: js.Array[String]
  var remove: js.UndefOr[Boolean] = js.undefined
}

object redactOptions {
  @scala.inline
  def apply(
    paths: js.Array[String],
    censor: String | (js.Function1[/* v */ js.Any, _]) = null,
    remove: js.UndefOr[Boolean] = js.undefined
  ): redactOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
    if (censor != null) __obj.updateDynamic("censor")(censor.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[redactOptions]
  }
}

