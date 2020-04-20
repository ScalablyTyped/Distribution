package typings.pixiJs.PIXI.Application

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.Application
  * @typedef {object} Plugin
  * @property {function} init - Called when Application is constructed, scoped to Application instance.
  *  Passes in `options` as the only argument, which are Application constructor options.
  * @property {function} destroy - Called when destroying Application, scoped to Application instance
  */
trait Plugin extends js.Object {
  def destroy(params: js.Any*): js.Any
  def init(params: js.Any*): js.Any
}

object Plugin {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => js.Any, init: /* repeated */ js.Any => js.Any): Plugin = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Plugin]
  }
}

