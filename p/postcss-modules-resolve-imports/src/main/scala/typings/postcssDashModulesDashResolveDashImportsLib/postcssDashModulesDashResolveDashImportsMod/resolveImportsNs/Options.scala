package typings
package postcssDashModulesDashResolveDashImportsLib.postcssDashModulesDashResolveDashImportsMod.resolveImportsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var icssExports: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[Resolve] = js.undefined
}

object Options {
  @scala.inline
  def apply(icssExports: js.UndefOr[scala.Boolean] = js.undefined, resolve: Resolve = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(icssExports)) __obj.updateDynamic("icssExports")(icssExports)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Options]
  }
}

