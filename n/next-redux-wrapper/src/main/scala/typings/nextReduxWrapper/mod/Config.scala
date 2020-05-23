package typings.nextReduxWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var deserializeState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var overrideIsServer: js.UndefOr[Boolean] = js.undefined
  var serializeState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.undefined
  var storeKey: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    deserializeState: /* state */ js.Any => _ = null,
    overrideIsServer: js.UndefOr[Boolean] = js.undefined,
    serializeState: /* state */ js.Any => _ = null,
    storeKey: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (deserializeState != null) __obj.updateDynamic("deserializeState")(js.Any.fromFunction1(deserializeState))
    if (!js.isUndefined(overrideIsServer)) __obj.updateDynamic("overrideIsServer")(overrideIsServer.get.asInstanceOf[js.Any])
    if (serializeState != null) __obj.updateDynamic("serializeState")(js.Any.fromFunction1(serializeState))
    if (storeKey != null) __obj.updateDynamic("storeKey")(storeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

