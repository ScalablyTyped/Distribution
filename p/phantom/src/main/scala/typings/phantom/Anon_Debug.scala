package typings.phantom

import typings.phantom.phantomMod.winstonLeveledLogMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  var error: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  var info: js.UndefOr[winstonLeveledLogMethod] = js.undefined
  var warn: js.UndefOr[winstonLeveledLogMethod] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: winstonLeveledLogMethod = null,
    error: winstonLeveledLogMethod = null,
    info: winstonLeveledLogMethod = null,
    warn: winstonLeveledLogMethod = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Debug]
  }
}

