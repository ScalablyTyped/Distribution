package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[phantomLib.phantomMod.winstonLeveledLogMethod] = js.undefined
  var error: js.UndefOr[phantomLib.phantomMod.winstonLeveledLogMethod] = js.undefined
  var info: js.UndefOr[phantomLib.phantomMod.winstonLeveledLogMethod] = js.undefined
  var warn: js.UndefOr[phantomLib.phantomMod.winstonLeveledLogMethod] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: phantomLib.phantomMod.winstonLeveledLogMethod = null,
    error: phantomLib.phantomMod.winstonLeveledLogMethod = null,
    info: phantomLib.phantomMod.winstonLeveledLogMethod = null,
    warn: phantomLib.phantomMod.winstonLeveledLogMethod = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_Debug]
  }
}

