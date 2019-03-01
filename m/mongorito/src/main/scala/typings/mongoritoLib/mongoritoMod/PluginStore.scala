package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginStore extends js.Object {
  var model: js.UndefOr[Model] = js.undefined
  var modelClass: ModelClass
  def dispatch(arg: js.Any): js.Any
  def getState(): State
}

object PluginStore {
  @scala.inline
  def apply(
    dispatch: js.Function1[js.Any, js.Any],
    getState: js.Function0[State],
    modelClass: ModelClass,
    model: Model = null
  ): PluginStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatch")(dispatch)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("modelClass")(modelClass)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[PluginStore]
  }
}

