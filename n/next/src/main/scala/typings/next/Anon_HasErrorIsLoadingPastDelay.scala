package typings.next

import typings.next.distNextDashServerLibDynamicMod.LoadableGeneratedOptions
import typings.next.distNextDashServerLibDynamicMod.Loader
import typings.next.distNextDashServerLibDynamicMod.LoaderMap
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasErrorIsLoadingPastDelay[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Anon_Error, Element | Null]] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
}

object Anon_HasErrorIsLoadingPastDelay {
  @scala.inline
  def apply[P](
    loadableGenerated: LoadableGeneratedOptions = null,
    loader: Loader[P] | LoaderMap = null,
    loading: /* hasErrorIsLoadingPastDelay */ Anon_Error => Element | Null = null,
    ssr: js.UndefOr[Boolean] = js.undefined
  ): Anon_HasErrorIsLoadingPastDelay[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated)
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1(loading))
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[Anon_HasErrorIsLoadingPastDelay[P]]
  }
}

