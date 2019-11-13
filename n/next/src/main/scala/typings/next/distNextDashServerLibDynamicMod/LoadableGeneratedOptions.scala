package typings.next.distNextDashServerLibDynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadableGeneratedOptions extends js.Object {
  var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
  var webpack: js.UndefOr[js.Function0[_]] = js.undefined
}

object LoadableGeneratedOptions {
  @scala.inline
  def apply(modules: () => LoaderMap = null, webpack: () => _ = null): LoadableGeneratedOptions = {
    val __obj = js.Dynamic.literal()
    if (modules != null) __obj.updateDynamic("modules")(js.Any.fromFunction0(modules))
    if (webpack != null) __obj.updateDynamic("webpack")(js.Any.fromFunction0(webpack))
    __obj.asInstanceOf[LoadableGeneratedOptions]
  }
}

