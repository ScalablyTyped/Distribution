package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* info */ js.UndefOr[js.Object], scala.Unit]
  ] = js.undefined
  var error: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* info */ js.UndefOr[js.Object], scala.Unit]
  ] = js.undefined
  var info: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* info */ js.UndefOr[js.Object], scala.Unit]
  ] = js.undefined
  var warn: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* info */ js.UndefOr[js.Object], scala.Unit]
  ] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: (/* message */ java.lang.String, /* info */ js.UndefOr[js.Object]) => scala.Unit = null,
    error: (/* message */ java.lang.String, /* info */ js.UndefOr[js.Object]) => scala.Unit = null,
    info: (/* message */ java.lang.String, /* info */ js.UndefOr[js.Object]) => scala.Unit = null,
    warn: (/* message */ java.lang.String, /* info */ js.UndefOr[js.Object]) => scala.Unit = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction2(debug))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction2(info))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction2(warn))
    __obj.asInstanceOf[Anon_Debug]
  }
}

