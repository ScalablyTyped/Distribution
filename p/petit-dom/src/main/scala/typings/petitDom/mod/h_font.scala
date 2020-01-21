package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.font
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

