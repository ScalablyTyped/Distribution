package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.tfoot
import typings.std.HTMLTableSectionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_tfoot extends js.Object {
  def apply[E /* <: HTMLTableSectionElement */](`type`: tfoot): ElementNode[tfoot, E] = js.native
  def apply[E /* <: HTMLTableSectionElement */](`type`: tfoot, children: Content*): ElementNode[tfoot, E] = js.native
  def apply[E /* <: HTMLTableSectionElement */](`type`: tfoot, props: Props[E], children: Content*): ElementNode[tfoot, E] = js.native
}

