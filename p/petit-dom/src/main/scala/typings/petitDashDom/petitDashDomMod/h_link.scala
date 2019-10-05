package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.link
import typings.std.HTMLLinkElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_link extends js.Object {
  def apply[E /* <: HTMLLinkElement */](`type`: link): ElementNode[link, E] = js.native
  def apply[E /* <: HTMLLinkElement */](`type`: link, children: Content*): ElementNode[link, E] = js.native
  def apply[E /* <: HTMLLinkElement */](`type`: link, props: Props[E], children: Content*): ElementNode[link, E] = js.native
}

