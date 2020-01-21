package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.span
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

