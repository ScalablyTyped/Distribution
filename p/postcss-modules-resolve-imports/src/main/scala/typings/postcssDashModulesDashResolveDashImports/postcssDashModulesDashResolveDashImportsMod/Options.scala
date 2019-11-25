package typings.postcssDashModulesDashResolveDashImports.postcssDashModulesDashResolveDashImportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var icssExports: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[Resolve] = js.undefined
}

object Options {
  @scala.inline
  def apply(icssExports: js.UndefOr[Boolean] = js.undefined, resolve: Resolve = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(icssExports)) __obj.updateDynamic("icssExports")(icssExports.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

