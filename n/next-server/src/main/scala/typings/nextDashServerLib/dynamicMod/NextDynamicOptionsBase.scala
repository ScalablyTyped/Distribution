package typings
package nextDashServerLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base dynamic loader options (essential Loadable config required by `next/dynamic`)
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-loadable.LoadableExport.CommonOptions, 'loading' | 'modules'> ]: react-loadable.LoadableExport.CommonOptions[P]} */ trait NextDynamicOptionsBase extends js.Object {
  var loadableGenerated: js.UndefOr[nextDashServerLib.Anon_Modules] = js.undefined
  var loading: js.UndefOr[
    reactLib.reactMod.ComponentType[reactDashLoadableLib.LoadableExportNs.LoadingComponentProps] | js.Function0[scala.Null]
  ] = js.undefined
   // optional
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
}

object NextDynamicOptionsBase {
  @scala.inline
  def apply(
    loadableGenerated: nextDashServerLib.Anon_Modules = null,
    loading: reactLib.reactMod.ComponentType[reactDashLoadableLib.LoadableExportNs.LoadingComponentProps] | js.Function0[scala.Null] = null,
    ssr: js.UndefOr[scala.Boolean] = js.undefined
  ): NextDynamicOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextDynamicOptionsBase]
  }
}

