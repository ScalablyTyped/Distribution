package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.font
import typings.std.HTMLFontElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_font extends js.Object {
  def apply[E /* <: HTMLFontElement */](`type`: font): ElementNode[font, E] = js.native
  def apply[E /* <: HTMLFontElement */](`type`: font, children: Content*): ElementNode[font, E] = js.native
  def apply[E /* <: HTMLFontElement */](`type`: font, props: Props[E], children: Content*): ElementNode[font, E] = js.native
}

