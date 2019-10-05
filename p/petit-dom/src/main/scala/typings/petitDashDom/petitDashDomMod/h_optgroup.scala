package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.optgroup
import typings.std.HTMLOptGroupElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_optgroup extends js.Object {
  def apply[E /* <: HTMLOptGroupElement */](`type`: optgroup): ElementNode[optgroup, E] = js.native
  def apply[E /* <: HTMLOptGroupElement */](`type`: optgroup, children: Content*): ElementNode[optgroup, E] = js.native
  def apply[E /* <: HTMLOptGroupElement */](`type`: optgroup, props: Props[E], children: Content*): ElementNode[optgroup, E] = js.native
}

