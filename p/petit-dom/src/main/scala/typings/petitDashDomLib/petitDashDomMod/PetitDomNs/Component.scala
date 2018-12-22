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

