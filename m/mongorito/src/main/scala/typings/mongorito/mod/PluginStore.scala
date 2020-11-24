package typings.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginStore extends js.Object {
  
  def dispatch(arg: js.Any): js.Any = js.native
  
  def getState(): State = js.native
  
  var model: js.UndefOr[Model] = js.native
  
  var modelClass: ModelClass = js.native
}
object PluginStore {
  
  @scala.inline
  def apply(dispatch: js.Any => js.Any, getState: () => State, modelClass: ModelClass): PluginStore = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), modelClass = modelClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStore]
  }
  
  @scala.inline
  implicit class PluginStoreOps[Self <: PluginStore] (val x: Self) extends AnyVal {
    
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
    def setDispatch(value: js.Any => js.Any): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetState(value: () => State): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModelClass(value: ModelClass): Self = this.set("modelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
}
