package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.VNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "patch")
@js.native
object patch extends js.Object {
  def apply(newVNode: VNode, oldVNode: VNode): Element = js.native
  def apply(newVNode: VNode, oldVNode: VNode, parent: Element): Element = js.native
}

