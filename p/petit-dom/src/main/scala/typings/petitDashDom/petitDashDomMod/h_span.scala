package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.span
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_span extends js.Object {
  def apply[E /* <: HTMLSpanElement */](`type`: span): ElementNode[span, E] = js.native
  def apply[E /* <: HTMLSpanElement */](`type`: span, children: Content*): ElementNode[span, E] = js.native
  def apply[E /* <: HTMLSpanElement */](`type`: span, props: Props[E], children: Content*): ElementNode[span, E] = js.native
}

