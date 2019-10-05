package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.address
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

