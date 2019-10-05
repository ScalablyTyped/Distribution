package typings.nextDashServer.dynamicMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextDashServer.Anon_Modules
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dynamic loader options for mapped modules.
trait NextModuleMapOptions[P /* <: js.Object */, E /* <: StringDictionary[js.Any] */] extends NextDynamicOptionsBase {
  def modules(): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.AsyncComponentLoader<E[P]>}
    */ typings.nextDashServer.nextDashServerStrings.NextModuleMapOptions with E
  def render(
    props: P,
    loaded: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.DynamicComponent<E[P]>}
    */ typings.nextDashServer.nextDashServerStrings.NextModuleMapOptions with E
  ): ReactNode
}

object NextModuleMapOptions {
  @scala.inline
  def apply[P /* <: js.Object */, E /* <: StringDictionary[js.Any] */](
    modules: () => /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.AsyncComponentLoader<E[P]>}
    */ typings.nextDashServer.nextDashServerStrings.NextModuleMapOptions with E,
    render: (P, /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: next-server.next-server/dynamic.DynamicComponent<E[P]>}
    */ typings.nextDashServer.nextDashServerStrings.NextModuleMapOptions with E) => ReactNode,
    loadableGenerated: Anon_Modules = null,
    loading: ComponentType[typings.reactDashLoadable.LoadableExport.LoadingComponentProps] | js.Function0[Null] = null,
    ssr: js.UndefOr[Boolean] = js.undefined
  ): NextModuleMapOptions[P, E] = {
    val __obj = js.Dynamic.literal(modules = js.Any.fromFunction0(modules), render = js.Any.fromFunction2(render))
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextModuleMapOptions[P, E]]
  }
}

