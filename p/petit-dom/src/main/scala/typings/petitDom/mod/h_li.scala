package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.li
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_li extends js.Object {
  def apply[E /* <: HTMLLIElement */](`type`: li): ElementNode[li, E] = js.native
  def apply[E /* <: HTMLLIElement */](`type`: li, children: Content*): ElementNode[li, E] = js.native
  def apply[E /* <: HTMLLIElement */](`type`: li, props: Props[E], children: Content*): ElementNode[li, E] = js.native
}

