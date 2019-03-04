package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[P /* <: ComponentProps */] extends js.Object {
  def mount(props: P, content: js.Array[VNode]): stdLib.Element
  def patch(
    element: stdLib.Element,
    newProps: P,
    oldProps: P,
    newContent: js.Array[VNode],
    oldContent: js.Array[VNode]
  ): stdLib.Element
  def unmount(element: stdLib.Element): scala.Unit
}

object Component {
  @scala.inline
  def apply[P /* <: ComponentProps */](
    mount: js.Function2[P, js.Array[VNode], stdLib.Element],
    patch: js.Function5[stdLib.Element, P, P, js.Array[VNode], js.Array[VNode], stdLib.Element],
    unmount: js.Function1[stdLib.Element, scala.Unit]
  ): Component[P] = {
    val __obj = js.Dynamic.literal(mount = mount, patch = patch, unmount = unmount)
  
    __obj.asInstanceOf[Component[P]]
  }
}

