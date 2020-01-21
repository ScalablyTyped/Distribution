package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.slot
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_slot extends js.Object {
  def apply[E /* <: HTMLSlotElement */](`type`: slot): ElementNode[slot, E] = js.native
  def apply[E /* <: HTMLSlotElement */](`type`: slot, children: Content*): ElementNode[slot, E] = js.native
  def apply[E /* <: HTMLSlotElement */](`type`: slot, props: Props[E], children: Content*): ElementNode[slot, E] = js.native
}

