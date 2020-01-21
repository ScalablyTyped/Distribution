package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.thead
import typings.std.HTMLTableSectionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_thead extends js.Object {
  def apply[E /* <: HTMLTableSectionElement */](`type`: thead): ElementNode[thead, E] = js.native
  def apply[E /* <: HTMLTableSectionElement */](`type`: thead, children: Content*): ElementNode[thead, E] = js.native
  def apply[E /* <: HTMLTableSectionElement */](`type`: thead, props: Props[E], children: Content*): ElementNode[thead, E] = js.native
}

