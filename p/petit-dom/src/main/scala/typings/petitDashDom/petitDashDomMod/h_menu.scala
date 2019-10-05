package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.menu
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

