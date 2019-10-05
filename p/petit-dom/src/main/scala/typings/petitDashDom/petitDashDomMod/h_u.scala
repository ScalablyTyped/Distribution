package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.u
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_u extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: u): ElementNode[u, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: u, children: Content*): ElementNode[u, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: u, props: Props[E], children: Content*): ElementNode[u, E] = js.native
}

