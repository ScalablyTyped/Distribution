package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.bdo
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_bdo extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: bdo): ElementNode[bdo, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: bdo, children: Content*): ElementNode[bdo, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: bdo, props: Props[E], children: Content*): ElementNode[bdo, E] = js.native
}

