package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.caption
import typings.std.HTMLTableCaptionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_caption extends js.Object {
  def apply[E /* <: HTMLTableCaptionElement */](`type`: caption): ElementNode[caption, E] = js.native
  def apply[E /* <: HTMLTableCaptionElement */](`type`: caption, children: Content*): ElementNode[caption, E] = js.native
  def apply[E /* <: HTMLTableCaptionElement */](`type`: caption, props: Props[E], children: Content*): ElementNode[caption, E] = js.native
}

