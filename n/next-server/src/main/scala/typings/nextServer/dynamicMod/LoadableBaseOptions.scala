package typings.nextServer.dynamicMod

import typings.nextServer.anon.Error
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions & {loading ? (hasErrorIsLoadingPastDelay : {  error ? :std.Error | null,   isLoading ? :boolean,   pastDelay ? :boolean,   timedOut ? :boolean}): react.react.<global>.JSX.Element | null,   loader ? :next-server.next-server/dist/lib/dynamic.Loader<P> | next-server.next-server/dist/lib/dynamic.LoaderMap,   loadableGenerated ? :next-server.next-server/dist/lib/dynamic.LoadableGeneratedOptions,   ssr ? :boolean} */
trait LoadableBaseOptions[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.undefined
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
  var webpack: js.UndefOr[js.Function0[_]] = js.undefined
}

object LoadableBaseOptions {
  @scala.inline
  def apply[P](
    loadableGenerated: LoadableGeneratedOptions = null,
    loader: Loader[P] | LoaderMap = null,
    loading: /* hasErrorIsLoadingPastDelay */ Error => Element | Null = null,
    modules: () => LoaderMap = null,
    ssr: js.UndefOr[Boolean] = js.undefined,
    webpack: () => _ = null
  ): LoadableBaseOptions[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1(loading))
    if (modules != null) __obj.updateDynamic("modules")(js.Any.fromFunction0(modules))
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.get.asInstanceOf[js.Any])
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[LoadableBaseOptions[P]]
  }
}

