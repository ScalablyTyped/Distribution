package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.Loader.loaderMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin to be installed for handling specific Loader resources.
  *
  * @memberof PIXI
  * @typedef ILoaderPlugin
  * @property {function} [add] - Function to call immediate after registering plugin.
  * @property {PIXI.Loader.loaderMiddleware} [pre] - Middleware function to run before load, the
  *           arguments for this are `(resource, next)`
  * @property {PIXI.Loader.loaderMiddleware} [use] - Middleware function to run after load, the
  *           arguments for this are `(resource, next)`
  */
trait ILoaderPlugin extends js.Object {
  var add: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var pre: js.UndefOr[loaderMiddleware] = js.undefined
  var use: js.UndefOr[loaderMiddleware] = js.undefined
}

object ILoaderPlugin {
  @scala.inline
  def apply(
    add: /* repeated */ js.Any => _ = null,
    pre: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit = null,
    use: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit = null
  ): ILoaderPlugin = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction2(pre))
    if (use != null) __obj.updateDynamic("use")(js.Any.fromFunction2(use))
    __obj.asInstanceOf[ILoaderPlugin]
  }
}

