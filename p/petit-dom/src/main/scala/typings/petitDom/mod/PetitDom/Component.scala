package typings.petitDom.mod.PetitDom

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[P /* <: ComponentProps */] extends js.Object {
  def mount(props: P, content: js.Array[VNode]): Element
  def patch(
    element: Element,
    newProps: P,
    oldProps: P,
    newContent: js.Array[VNode],
    oldContent: js.Array[VNode]
  ): Element
  def unmount(element: Element): Unit
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
}

