package typings.nano.mod

import typings.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var cookie: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[js.Function2[/* id */ String, /* args */ js.Any, Unit]] = js.undefined
  var parseUrl: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.undefined
  var requestDefaults: js.UndefOr[CoreOptions] = js.undefined
  var url: String
}

object Configuration {
  @scala.inline
  def apply(
    url: String,
    cookie: String = null,
    log: (/* id */ String, /* args */ js.Any) => Unit = null,
    parseUrl: js.UndefOr[Boolean] = js.undefined,
    request: /* params */ js.Any => Unit = null,
    requestDefaults: CoreOptions = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (!js.isUndefined(parseUrl)) __obj.updateDynamic("parseUrl")(parseUrl.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1(request))
    if (requestDefaults != null) __obj.updateDynamic("requestDefaults")(requestDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

