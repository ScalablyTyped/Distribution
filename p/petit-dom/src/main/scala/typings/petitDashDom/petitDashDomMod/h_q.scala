package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.q
import typings.std.HTMLQuoteElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_q extends js.Object {
  def apply[E /* <: HTMLQuoteElement */](`type`: q): ElementNode[q, E] = js.native
  def apply[E /* <: HTMLQuoteElement */](`type`: q, children: Content*): ElementNode[q, E] = js.native
  def apply[E /* <: HTMLQuoteElement */](`type`: q, props: Props[E], children: Content*): ElementNode[q, E] = js.native
}

