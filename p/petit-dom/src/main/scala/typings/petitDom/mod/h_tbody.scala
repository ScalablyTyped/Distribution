package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.tbody
import typings.std.HTMLTableSectionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_tbody extends js.Object {
  def apply[E /* <: HTMLTableSectionElement */](`type`: tbody): ElementNode[tbody, E] = js.native
  def apply[E /* <: HTMLTableSectionElement */](`type`: tbody, children: Content*): ElementNode[tbody, E] = js.native
  def apply[E /* <: HTMLTableSectionElement */](`type`: tbody, props: Props[E], children: Content*): ElementNode[tbody, E] = js.native
}

