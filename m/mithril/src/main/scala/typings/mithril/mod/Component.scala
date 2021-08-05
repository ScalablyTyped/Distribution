package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  * Any Javascript object that has a view method can be used as a Mithril component.
  * Components can be consumed via the m() utility.
  */
trait Component[Attrs, State /* <: Lifecycle[Attrs, State] */]
  extends StObject
     with Lifecycle[Attrs, State]
     with _ComponentTypes[Attrs, State] {
  
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[Attrs, State]): Children | Null | Unit
}
object Component {
  
  inline def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](view: Vnode[Attrs, State] => Children | Null | Unit): Component[Attrs, State] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[Component[Attrs, State]]
  }
  
  extension [Self <: Component[?, ?], Attrs, State /* <: Lifecycle[Attrs, State] */](x: Self & (Component[Attrs, State])) {
    
    inline def setView(value: Vnode[Attrs, State] => Children | Null | Unit): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
