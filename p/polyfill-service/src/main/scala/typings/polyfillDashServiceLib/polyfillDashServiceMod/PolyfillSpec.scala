package typings
package polyfillDashServiceLib.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyfillSpec extends js.Object {
  var aliasOf: js.UndefOr[stdLib.Set[java.lang.String]] = js.undefined
  var flags: stdLib.Set[PolyfillFlag]
}

object PolyfillSpec {
  @scala.inline
  def apply(flags: stdLib.Set[PolyfillFlag], aliasOf: stdLib.Set[java.lang.String] = null): PolyfillSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    if (aliasOf != null) __obj.updateDynamic("aliasOf")(aliasOf)
    __obj.asInstanceOf[PolyfillSpec]
  }
}

