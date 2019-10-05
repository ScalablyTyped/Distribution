package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.s
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_s extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: s): ElementNode[s, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: s, children: Content*): ElementNode[s, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: s, props: Props[E], children: Content*): ElementNode[s, E] = js.native
}

