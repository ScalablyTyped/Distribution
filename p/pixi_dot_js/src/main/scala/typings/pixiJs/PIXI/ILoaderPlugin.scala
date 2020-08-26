package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.Loader.loaderMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin to be installed for handling specific Loader resources.
  *
  * @memberof PIXI
  * @typedef {object} ILoaderPlugin
  * @property {function} [add] - Function to call immediate after registering plugin.
  * @property {PIXI.Loader.loaderMiddleware} [pre] - Middleware function to run before load, the
  *           arguments for this are `(resource, next)`
  * @property {PIXI.Loader.loaderMiddleware} [use] - Middleware function to run after load, the
  *           arguments for this are `(resource, next)`
  */
@js.native
trait ILoaderPlugin extends js.Object {
  var add: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var pre: js.UndefOr[loaderMiddleware] = js.native
  var use: js.UndefOr[loaderMiddleware] = js.native
}

object ILoaderPlugin {
  @scala.inline
  def apply(): ILoaderPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderPlugin]
  }
  @scala.inline
  implicit class ILoaderPluginOps[Self <: ILoaderPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: /* repeated */ js.Any => _): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setPre(
      value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit
    ): Self = this.set("pre", js.Any.fromFunction2(value))
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setUse(
      value: (/* resource */ LoaderResource, /* next */ js.Function1[/* repeated */ js.Any, js.Any]) => Unit
    ): Self = this.set("use", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

