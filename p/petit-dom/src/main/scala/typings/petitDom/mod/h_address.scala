package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.address
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_address extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: address): ElementNode[address, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: address, children: Content*): ElementNode[address, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: address, props: Props[E], children: Content*): ElementNode[address, E] = js.native
}

