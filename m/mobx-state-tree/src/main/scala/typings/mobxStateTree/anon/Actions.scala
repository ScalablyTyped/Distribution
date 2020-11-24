package typings.mobxStateTree.anon

import typings.mobxStateTree.modelMod.ModelActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions[A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */] extends js.Object {
  
  var actions: js.UndefOr[A] = js.native
  
  var state: js.UndefOr[VS] = js.native
  
  var views: js.UndefOr[V] = js.native
}
object Actions {
  
  @scala.inline
  def apply[A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */](): Actions[A, V, VS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions[A, V, VS]]
  }
  
  @scala.inline
  implicit class ActionsOps[Self <: Actions[_, _, _], A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */] (val x: Self with (Actions[A, V, VS])) extends AnyVal {
    
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
    def setActions(value: A): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setState(value: VS): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setViews(value: V): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
