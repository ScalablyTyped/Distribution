package typings
package memDashFsDashEditorLib.memDashFsDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var globOptions: js.UndefOr[globLib.globMod.GNs.IOptions] = js.undefined
  var process: js.UndefOr[ProcessingFunc] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(globOptions: globLib.globMod.GNs.IOptions = null, process: ProcessingFunc = null): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions)
    if (process != null) __obj.updateDynamic("process")(process)
    __obj.asInstanceOf[CopyOptions]
  }
}

