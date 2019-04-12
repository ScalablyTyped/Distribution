package typings
package nextDashServerLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dynamic loader options for mapped modules.
trait NextModuleMapOptions[P /* <: js.Object */, E /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] extends NextDynamicOptionsBase {
  def modules(): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.AsyncComponentLoader<E[P]>}
    */ nextDashServerLib.nextDashServerLibStrings.NextModuleMapOptions with E
  def render(
    props: P,
    loaded: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.DynamicComponent<E[P]>}
    */ nextDashServerLib.nextDashServerLibStrings.NextModuleMapOptions with E
  ): reactLib.reactMod.ReactNs.ReactNode
}

object NextModuleMapOptions {
  @scala.inline
  def apply[P /* <: js.Object */, E /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    modules: () => /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.AsyncComponentLoader<E[P]>}
    */ nextDashServerLib.nextDashServerLibStrings.NextModuleMapOptions with E,
    render: (P, /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.DynamicComponent<E[P]>}
    */ nextDashServerLib.nextDashServerLibStrings.NextModuleMapOptions with E) => reactLib.reactMod.ReactNs.ReactNode,
    loadableGenerated: nextDashServerLib.Anon_Modules = null,
    loading: reactLib.reactMod.ReactNs.ComponentType[reactDashLoadableLib.LoadableExportNs.LoadingComponentProps] | js.Function0[scala.Null] = null,
    ssr: js.UndefOr[scala.Boolean] = js.undefined
  ): NextModuleMapOptions[P, E] = {
    val __obj = js.Dynamic.literal(modules = js.Any.fromFunction0(modules), render = js.Any.fromFunction2(render))
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextModuleMapOptions[P, E]]
  }
}

