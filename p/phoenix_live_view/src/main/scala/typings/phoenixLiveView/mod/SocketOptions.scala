package typings.phoenixLiveView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var bindingPrefix: js.UndefOr[String] = js.undefined
  var defaults: js.UndefOr[Defaults] = js.undefined
  var dom: js.UndefOr[DomOptions] = js.undefined
  var hooks: js.UndefOr[js.Object] = js.undefined
  var loaderTimeout: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var viewLogger: js.UndefOr[ViewLogger] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    bindingPrefix: String = null,
    defaults: Defaults = null,
    dom: DomOptions = null,
    hooks: js.Object = null,
    loaderTimeout: js.UndefOr[Double] = js.undefined,
    params: js.Object = null,
    viewLogger: (/* view */ View, /* kind */ String, /* msg */ js.Any, /* obj */ js.Any) => Unit = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (bindingPrefix != null) __obj.updateDynamic("bindingPrefix")(bindingPrefix.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(loaderTimeout)) __obj.updateDynamic("loaderTimeout")(loaderTimeout.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (viewLogger != null) __obj.updateDynamic("viewLogger")(js.Any.fromFunction4(viewLogger))
    __obj.asInstanceOf[SocketOptions]
  }
}

