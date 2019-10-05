package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.caption
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

