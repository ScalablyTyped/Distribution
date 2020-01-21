package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.menu
import typings.std.HTMLMenuElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_menu extends js.Object {
  def apply[E /* <: HTMLMenuElement */](`type`: menu): ElementNode[menu, E] = js.native
  def apply[E /* <: HTMLMenuElement */](`type`: menu, children: Content*): ElementNode[menu, E] = js.native
  def apply[E /* <: HTMLMenuElement */](`type`: menu, props: Props[E], children: Content*): ElementNode[menu, E] = js.native
}

