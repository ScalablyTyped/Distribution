package typings.nextDashServer.dynamicMod

import typings.nextDashServer.Anon_Modules
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dynamic loader options with `loader` key.
trait NextDynamicLoaderOptions[P /* <: js.Object */] extends NextDynamicOptionsBase {
  var loader: js.UndefOr[AsyncComponentLoader[P]] = js.undefined
}

object NextDynamicLoaderOptions {
  @scala.inline
  def apply[P /* <: js.Object */](
    loadableGenerated: Anon_Modules = null,
    loader: () => AsyncComponent[P] = null,
    loading: ComponentType[typings.reactDashLoadable.LoadableExport.LoadingComponentProps] | js.Function0[Null] = null,
    ssr: js.UndefOr[Boolean] = js.undefined
  ): NextDynamicLoaderOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loader != null) __obj.updateDynamic("loader")(js.Any.fromFunction0(loader))
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextDynamicLoaderOptions[P]]
  }
}

