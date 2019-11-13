package typings.next.distClientRouterMod

import typings.next.distNextDashServerLibRouterRouterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingletonRouterBase extends js.Object {
  var readyCallbacks: js.Array[js.Function0[_]]
  var router: default | Null
  def ready(cb: js.Function0[_]): Unit
}

object SingletonRouterBase {
  @scala.inline
  def apply(ready: js.Function0[_] => Unit, readyCallbacks: js.Array[js.Function0[_]], router: default = null): SingletonRouterBase = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1(ready), readyCallbacks = readyCallbacks)
    if (router != null) __obj.updateDynamic("router")(router)
    __obj.asInstanceOf[SingletonRouterBase]
  }
}

