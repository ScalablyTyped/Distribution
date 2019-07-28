package typings.mirrorx.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultOptions extends js.Object {
  var historyMode: js.UndefOr[String] = js.undefined
  var initialState: js.UndefOr[js.Object] = js.undefined
  var middlewares: js.Array[_]
  def addEffect(name: String, handler: js.Function0[_]): js.Any
}

object defaultOptions {
  @scala.inline
  def apply(
    addEffect: (String, js.Function0[_]) => js.Any,
    middlewares: js.Array[_],
    historyMode: String = null,
    initialState: js.Object = null
  ): defaultOptions = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction2(addEffect), middlewares = middlewares)
    if (historyMode != null) __obj.updateDynamic("historyMode")(historyMode)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    __obj.asInstanceOf[defaultOptions]
  }
}

