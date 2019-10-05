package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.colgroup
import typings.std.HTMLTableColElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_colgroup extends js.Object {
  def apply[E /* <: HTMLTableColElement */](`type`: colgroup): ElementNode[colgroup, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: colgroup, children: Content*): ElementNode[colgroup, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: colgroup, props: Props[E], children: Content*): ElementNode[colgroup, E] = js.native
}

