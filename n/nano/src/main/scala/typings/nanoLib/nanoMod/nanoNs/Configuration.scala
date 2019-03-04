package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[js.Function2[/* id */ java.lang.String, /* args */ js.Any, scala.Unit]] = js.undefined
  var parseUrl: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* params */ js.Any, scala.Unit]] = js.undefined
  var requestDefaults: js.UndefOr[requestLib.requestMod.requestNs.CoreOptions] = js.undefined
  var url: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(
    url: java.lang.String,
    cookie: java.lang.String = null,
    log: js.Function2[/* id */ java.lang.String, /* args */ js.Any, scala.Unit] = null,
    parseUrl: js.UndefOr[scala.Boolean] = js.undefined,
    request: js.Function1[/* params */ js.Any, scala.Unit] = null,
    requestDefaults: requestLib.requestMod.requestNs.CoreOptions = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(url = url)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (log != null) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(parseUrl)) __obj.updateDynamic("parseUrl")(parseUrl)
    if (request != null) __obj.updateDynamic("request")(request)
    if (requestDefaults != null) __obj.updateDynamic("requestDefaults")(requestDefaults)
    __obj.asInstanceOf[Configuration]
  }
}

