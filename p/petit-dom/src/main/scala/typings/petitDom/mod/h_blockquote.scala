package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.blockquote
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

