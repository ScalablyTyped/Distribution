package typings.petitDom.mod.PetitDom

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[P /* <: ComponentProps */] extends js.Object {
  
  def mount(props: P, content: js.Array[VNode]): Element = js.native
  
  def patch(
    element: Element,
    newProps: P,
    oldProps: P,
    newContent: js.Array[VNode],
    oldContent: js.Array[VNode]
  ): Element = js.native
  
  def unmount(element: Element): Unit = js.native
}
object Component {
  
  @scala.inline
  def apply[P /* <: ComponentProps */](
    mount: (P, js.Array[VNode]) => Element,
    patch: (Element, P, P, js.Array[VNode], js.Array[VNode]) => Element,
    unmount: Element => Unit
  ): Component[P] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction2(mount), patch = js.Any.fromFunction5(patch), unmount = js.Any.fromFunction1(unmount))
    __obj.asInstanceOf[Component[P]]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component[_], P /* <: ComponentProps */] (val x: Self with Component[P]) extends AnyVal {
    
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
    def setMount(value: (P, js.Array[VNode]) => Element): Self = this.set("mount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPatch(value: (Element, P, P, js.Array[VNode], js.Array[VNode]) => Element): Self = this.set("patch", js.Any.fromFunction5(value))
    
    @scala.inline
    def setUnmount(value: Element => Unit): Self = this.set("unmount", js.Any.fromFunction1(value))
  }
}
