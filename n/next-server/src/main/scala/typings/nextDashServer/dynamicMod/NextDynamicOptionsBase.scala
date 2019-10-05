package typings.nextDashServer.dynamicMod

import typings.nextDashServer.Anon_Modules
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base dynamic loader options (essential Loadable config required by `next/dynamic`)
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-loadable.LoadableExport.CommonOptions, 'loading' | 'modules'> ]: react-loadable.LoadableExport.CommonOptions[P]} */ trait NextDynamicOptionsBase extends js.Object {
  var loadableGenerated: js.UndefOr[Anon_Modules] = js.undefined
  var loading: js.UndefOr[
    ComponentType[typings.reactDashLoadable.LoadableExport.LoadingComponentProps] | js.Function0[Null]
  ] = js.undefined
   // optional
  var ssr: js.UndefOr[Boolean] = js.undefined
}

object NextDynamicOptionsBase {
  @scala.inline
  def apply(
    loadableGenerated: Anon_Modules = null,
    loading: ComponentType[typings.reactDashLoadable.LoadableExport.LoadingComponentProps] | js.Function0[Null] = null,
    ssr: js.UndefOr[Boolean] = js.undefined
  ): NextDynamicOptionsBase = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextDynamicOptionsBase]
  }
}

