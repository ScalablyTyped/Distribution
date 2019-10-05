package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.p
import typings.std.HTMLParagraphElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_p extends js.Object {
  def apply[E /* <: HTMLParagraphElement */](`type`: p): ElementNode[p, E] = js.native
  def apply[E /* <: HTMLParagraphElement */](`type`: p, children: Content*): ElementNode[p, E] = js.native
  def apply[E /* <: HTMLParagraphElement */](`type`: p, props: Props[E], children: Content*): ElementNode[p, E] = js.native
}

