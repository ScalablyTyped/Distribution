package typings
package nextDashServerLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-loadable.react-loadable.CommonOptions, 'loading' | 'modules'> ]: react-loadable.react-loadable.CommonOptions[P]} */ trait NextDynamicOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[nextDashServerLib.Anon_Modules] = js.undefined
   // optional
  var loader: js.UndefOr[AsyncComponentLoader[P]] = js.undefined
   // overridden
  var loading: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashLoadableLib.LoadableExportNs.LoadingComponentProps] | js.Function0[scala.Null]
  ] = js.undefined
  var modules: js.UndefOr[js.Function0[ModuleMapping]] = js.undefined
   // optional, overriden
  var render: js.UndefOr[
    js.Function2[/* props */ P, /* loaded */ LoadedModuleMapping, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
   // optional, overriden
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
}

object NextDynamicOptions {
  @scala.inline
  def apply[P](
    loadableGenerated: nextDashServerLib.Anon_Modules = null,
    loader: AsyncComponentLoader[P] = null,
    loading: reactLib.reactMod.ReactNs.ComponentType[reactDashLoadableLib.LoadableExportNs.LoadingComponentProps] | js.Function0[scala.Null] = null,
    modules: () => ModuleMapping = null,
    render: (/* props */ P, /* loaded */ LoadedModuleMapping) => reactLib.reactMod.ReactNs.ReactNode = null,
    ssr: js.UndefOr[scala.Boolean] = js.undefined
  ): NextDynamicOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(js.Any.fromFunction0(modules))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextDynamicOptions[P]]
  }
}

