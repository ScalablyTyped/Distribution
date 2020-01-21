package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.p
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

