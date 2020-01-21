package typings.octokitRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
  var error: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
  var info: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
  var warn: js.UndefOr[js.Function2[/* message */ String, /* info */ js.UndefOr[js.Object], Unit]] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(
    debug: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit = null,
    error: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit = null,
    info: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit = null,
    warn: (/* message */ String, /* info */ js.UndefOr[js.Object]) => Unit = null
  ): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2(debug))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction2(info))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2(warn))
    __obj.asInstanceOf[AnonDebug]
  }
}

