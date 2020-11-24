package typings.popperjsCore.typesMod

import typings.popperjsCore.anon.PartialOptionsGenericany
import typings.popperjsCore.anon.PartialState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  def destroy(): Unit = js.native
  
  def forceUpdate(): Unit = js.native
  
  def setOptions(options: PartialOptionsGenericany): js.Promise[PartialState] = js.native
  
  var state: State = js.native
  
  def update(): js.Promise[PartialState] = js.native
}
object Instance {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    forceUpdate: () => Unit,
    setOptions: PartialOptionsGenericany => js.Promise[PartialState],
    state: State,
    update: () => js.Promise[PartialState]
  ): Instance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), forceUpdate = js.Any.fromFunction0(forceUpdate), setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOptions(value: PartialOptionsGenericany => js.Promise[PartialState]): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => js.Promise[PartialState]): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
