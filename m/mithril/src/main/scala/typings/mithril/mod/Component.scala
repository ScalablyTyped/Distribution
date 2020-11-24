package typings.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  * Any Javascript object that has a view method can be used as a Mithril component.
  * Components can be consumed via the m() utility.
  */
@js.native
trait Component[Attrs, State /* <: Lifecycle[Attrs, State] */]
  extends Lifecycle[Attrs, State]
     with _ComponentTypes[Attrs, State] {
  
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[Attrs, State]): Children | Null | Unit = js.native
}
object Component {
  
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](view: Vnode[Attrs, State] => Children | Null | Unit): Component[Attrs, State] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[Component[Attrs, State]]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component[_, _], Attrs, State /* <: Lifecycle[Attrs, State] */] (val x: Self with (Component[Attrs, State])) extends AnyVal {
    
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
    def setView(value: Vnode[Attrs, State] => Children | Null | Unit): Self = this.set("view", js.Any.fromFunction1(value))
  }
}
