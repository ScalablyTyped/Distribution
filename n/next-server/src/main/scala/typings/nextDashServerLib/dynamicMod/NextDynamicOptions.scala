package typings
package nextDashServerLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick<react-loadable.react-loadable.CommonOptions, std.Exclude<keyof react-loadable.react-loadable.CommonOptions, 'loading' | 'modules'>>) */ trait NextDynamicOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[nextDashServerLib.Anon_Webpack] = js.undefined
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

