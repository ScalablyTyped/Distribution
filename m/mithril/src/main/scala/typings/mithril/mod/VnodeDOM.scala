package typings.mithril.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// In some lifecycle methods, Vnode will have a dom property
// and possibly a domSize property.
@js.native
trait VnodeDOM[Attrs, State /* <: Lifecycle[Attrs, State] */] extends Vnode[Attrs, State] {
  
  /** Points to the element that corresponds to the vnode. */
  var dom: Element = js.native
  
  /** This defines the number of DOM elements that the vnode represents (starting from the element referenced by the dom property). */
  var domSize: js.UndefOr[Double] = js.native
}
object VnodeDOM {
  
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](attrs: Attrs, dom: Element, state: State, tag: String | (ComponentTypes[Attrs, State])): VnodeDOM[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[VnodeDOM[Attrs, State]]
  }
  
  @scala.inline
  implicit class VnodeDOMOps[Self <: VnodeDOM[_, _], Attrs, State /* <: Lifecycle[Attrs, State] */] (val x: Self with (VnodeDOM[Attrs, State])) extends AnyVal {
    
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
    def setDom(value: Element): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomSize(value: Double): Self = this.set("domSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomSize: Self = this.set("domSize", js.undefined)
  }
}
