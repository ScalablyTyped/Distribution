package typings.pixiJs.PIXI.Application

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @memberof PIXI.Application
  * @typedef {object} Plugin
  * @property {function} init - Called when Application is constructed, scoped to Application instance.
  *  Passes in `options` as the only argument, which are Application constructor options.
  * @property {function} destroy - Called when destroying Application, scoped to Application instance
  */
@js.native
trait Plugin extends js.Object {
  
  def destroy(params: js.Any*): js.Any = js.native
  
  def init(params: js.Any*): js.Any = js.native
}
object Plugin {
  
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => js.Any, init: /* repeated */ js.Any => js.Any): Plugin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: /* repeated */ js.Any => js.Any): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: /* repeated */ js.Any => js.Any): Self = this.set("init", js.Any.fromFunction1(value))
  }
}
