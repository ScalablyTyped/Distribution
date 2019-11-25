package typings.polyfillDashService.polyfillDashServiceMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyfillSpec extends js.Object {
  var aliasOf: js.UndefOr[Set[String]] = js.undefined
  var flags: Set[PolyfillFlag]
}

object PolyfillSpec {
  @scala.inline
  def apply(flags: Set[PolyfillFlag], aliasOf: Set[String] = null): PolyfillSpec = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (aliasOf != null) __obj.updateDynamic("aliasOf")(aliasOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyfillSpec]
  }
}

