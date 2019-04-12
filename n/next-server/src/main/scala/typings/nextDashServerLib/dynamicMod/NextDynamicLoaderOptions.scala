package typings
package nextDashServerLib.dynamicMod

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
    loadableGenerated: nextDashServerLib.Anon_Modules = null,
    loader: AsyncComponentLoader[P] = null,
    loading: reactLib.reactMod.ReactNs.ComponentType[reactDashLoadableLib.LoadableExportNs.LoadingComponentProps] | js.Function0[scala.Null] = null,
    ssr: js.UndefOr[scala.Boolean] = js.undefined
  ): NextDynamicLoaderOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[NextDynamicLoaderOptions[P]]
  }
}

