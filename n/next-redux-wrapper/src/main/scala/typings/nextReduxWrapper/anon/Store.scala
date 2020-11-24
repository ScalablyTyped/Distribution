package typings.nextReduxWrapper.anon

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[S /* <: js.Object */, A /* <: Action[_] */] extends js.Object {
  
  var store: typings.redux.mod.Store[S, A] = js.native
}
object Store {
  
  @scala.inline
  def apply[S /* <: js.Object */, A /* <: Action[_] */](store: typings.redux.mod.Store[S, A]): Store[S, A] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store[S, A]]
  }
  
  @scala.inline
  implicit class StoreOps[Self <: Store[_, _], S /* <: js.Object */, A /* <: Action[_] */] (val x: Self with (Store[S, A])) extends AnyVal {
    
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
    def setStore(value: typings.redux.mod.Store[S, A]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
