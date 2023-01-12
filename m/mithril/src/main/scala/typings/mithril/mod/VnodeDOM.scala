package typings.mithril.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// In some lifecycle methods, Vnode will have a dom property
// and possibly a domSize property.
trait VnodeDOM[Attrs, State]
  extends StObject
     with Vnode[Attrs, State] {
  
  /** Points to the element that corresponds to the vnode. */
  var dom: Element
  
  /** This defines the number of DOM elements that the vnode represents (starting from the element referenced by the dom property). */
  var domSize: js.UndefOr[Double] = js.undefined
}
object VnodeDOM {
  
  inline def apply[Attrs, State](attrs: Attrs, dom: Element, state: State, tag: String | (ComponentTypes[Attrs, State])): VnodeDOM[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[VnodeDOM[Attrs, State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VnodeDOM[?, ?], Attrs, State] (val x: Self & (VnodeDOM[Attrs, State])) extends AnyVal {
    
    inline def setDom(value: Element): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomSize(value: Double): Self = StObject.set(x, "domSize", value.asInstanceOf[js.Any])
    
    inline def setDomSizeUndefined: Self = StObject.set(x, "domSize", js.undefined)
  }
}
