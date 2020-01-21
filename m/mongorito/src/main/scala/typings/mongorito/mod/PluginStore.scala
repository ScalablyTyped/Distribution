package typings.mongorito.mod

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
  def apply(dispatch: js.Any => js.Any, getState: () => State, modelClass: ModelClass, model: Model = null): PluginStore = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), modelClass = modelClass.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStore]
  }
}

