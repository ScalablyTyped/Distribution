package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.table
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_table extends js.Object {
  def apply[E /* <: HTMLTableElement */](`type`: table): ElementNode[table, E] = js.native
  def apply[E /* <: HTMLTableElement */](`type`: table, children: Content*): ElementNode[table, E] = js.native
  def apply[E /* <: HTMLTableElement */](`type`: table, props: Props[E], children: Content*): ElementNode[table, E] = js.native
}

