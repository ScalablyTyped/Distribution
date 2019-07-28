package typings.polyfillDashService.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var flags: js.UndefOr[js.Array[PolyfillFlag]] = js.undefined
}

object Feature {
  @scala.inline
  def apply(flags: js.Array[PolyfillFlag] = null): Feature = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Feature]
  }
}

