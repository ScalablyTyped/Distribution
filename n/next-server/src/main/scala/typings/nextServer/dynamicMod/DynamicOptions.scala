package typings.nextServer.dynamicMod

import typings.nextServer.anon.Error
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableBaseOptions<P> & {  render ? :(props : P, loaded : any): react.react.<global>.JSX.Element} */
trait DynamicOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.undefined
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
  /**
    * @deprecated the modules option has been planned for removal
    */
  var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ js.Any, Element]] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
  var webpack: js.UndefOr[js.Function0[_]] = js.undefined
}

object DynamicOptions {
  @scala.inline
  def apply[P](
    loadableGenerated: LoadableGeneratedOptions = null,
    loader: Loader[P] | LoaderMap = null,
    loading: /* hasErrorIsLoadingPastDelay */ Error => Element | Null = null,
    modules: () => LoaderMap = null,
    render: (/* props */ P, /* loaded */ js.Any) => Element = null,
    ssr: js.UndefOr[Boolean] = js.undefined,
    webpack: () => _ = null
  ): DynamicOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1(loading))
    if (modules != null) __obj.updateDynamic("modules")(js.Any.fromFunction0(modules))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.get.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[DynamicOptions[P]]
  }
}

