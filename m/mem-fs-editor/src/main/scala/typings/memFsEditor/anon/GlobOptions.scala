package typings.memFsEditor.anon

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.undefined
}

object GlobOptions {
  @scala.inline
  def apply(globOptions: IOptions = null): GlobOptions = {
    val __obj = js.Dynamic.literal()
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobOptions]
  }
}

