package typings.memFsEditor

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.undefined
}

object AnonGlobOptions {
  @scala.inline
  def apply(globOptions: IOptions = null): AnonGlobOptions = {
    val __obj = js.Dynamic.literal()
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobOptions]
  }
}

