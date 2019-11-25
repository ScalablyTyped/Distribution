package typings.memDashFsDashEditor.memDashFsDashEditorMod

import typings.glob.globMod.IOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.undefined
  var process: js.UndefOr[ProcessingFunc] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    globOptions: IOptions = null,
    process: (/* contents */ Buffer, /* path */ String) => Contents = null
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction2(process))
    __obj.asInstanceOf[CopyOptions]
  }
}

