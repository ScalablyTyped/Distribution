package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.blockquote
import typings.std.HTMLQuoteElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_blockquote extends js.Object {
  def apply[E /* <: HTMLQuoteElement */](`type`: blockquote): ElementNode[blockquote, E] = js.native
  def apply[E /* <: HTMLQuoteElement */](`type`: blockquote, children: Content*): ElementNode[blockquote, E] = js.native
  def apply[E /* <: HTMLQuoteElement */](`type`: blockquote, props: Props[E], children: Content*): ElementNode[blockquote, E] = js.native
}

