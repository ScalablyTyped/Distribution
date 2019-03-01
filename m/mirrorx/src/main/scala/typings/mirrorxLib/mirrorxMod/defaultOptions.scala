package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait defaultOptions extends js.Object {
  var historyMode: js.UndefOr[java.lang.String] = js.undefined
  var initialState: js.UndefOr[js.Object] = js.undefined
  var middlewares: js.Array[_]
  def addEffect(name: java.lang.String, handler: js.Function0[_]): js.Any
}

object defaultOptions {
  @scala.inline
  def apply(
    addEffect: js.Function2[java.lang.String, js.Function0[_], js.Any],
    middlewares: js.Array[_],
    historyMode: java.lang.String = null,
    initialState: js.Object = null
  ): defaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEffect")(addEffect)
    __obj.updateDynamic("middlewares")(middlewares)
    if (historyMode != null) __obj.updateDynamic("historyMode")(historyMode)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    __obj.asInstanceOf[defaultOptions]
  }
}

