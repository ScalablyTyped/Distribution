package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.embed
import typings.std.HTMLEmbedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_embed extends js.Object {
  def apply[E /* <: HTMLEmbedElement */](`type`: embed): ElementNode[embed, E] = js.native
  def apply[E /* <: HTMLEmbedElement */](`type`: embed, children: Content*): ElementNode[embed, E] = js.native
  def apply[E /* <: HTMLEmbedElement */](`type`: embed, props: Props[E], children: Content*): ElementNode[embed, E] = js.native
}

