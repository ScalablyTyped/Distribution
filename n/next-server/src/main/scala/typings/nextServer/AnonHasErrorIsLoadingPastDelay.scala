package typings.nextServer

import typings.nextServer.dynamicMod.LoadableGeneratedOptions
import typings.nextServer.dynamicMod.Loader
import typings.nextServer.dynamicMod.LoaderMap
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasErrorIsLoadingPastDelay[P] extends js.Object {
  var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
  var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
  var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ AnonError, Element | Null]] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
}

object AnonHasErrorIsLoadingPastDelay {
  @scala.inline
  def apply[P](
    loadableGenerated: LoadableGeneratedOptions = null,
    loader: Loader[P] | LoaderMap = null,
    loading: /* hasErrorIsLoadingPastDelay */ AnonError => Element | Null = null,
    ssr: js.UndefOr[Boolean] = js.undefined
  ): AnonHasErrorIsLoadingPastDelay[P] = {
    val __obj = js.Dynamic.literal()
    if (loadableGenerated != null) __obj.updateDynamic("loadableGenerated")(loadableGenerated.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1(loading))
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasErrorIsLoadingPastDelay[P]]
  }
}

