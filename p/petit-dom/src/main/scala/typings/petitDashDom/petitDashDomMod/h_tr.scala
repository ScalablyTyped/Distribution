package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.tr
import typings.std.HTMLTableRowElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_tr extends js.Object {
  def apply[E /* <: HTMLTableRowElement */](`type`: tr): ElementNode[tr, E] = js.native
  def apply[E /* <: HTMLTableRowElement */](`type`: tr, children: Content*): ElementNode[tr, E] = js.native
  def apply[E /* <: HTMLTableRowElement */](`type`: tr, props: Props[E], children: Content*): ElementNode[tr, E] = js.native
}

