package typings.memDashFsDashEditor

import typings.glob.globMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlobOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.undefined
}

object Anon_GlobOptions {
  @scala.inline
  def apply(globOptions: IOptions = null): Anon_GlobOptions = {
    val __obj = js.Dynamic.literal()
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions)
    __obj.asInstanceOf[Anon_GlobOptions]
  }
}

