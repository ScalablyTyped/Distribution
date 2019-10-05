package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.hgroup
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_hgroup extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: hgroup): ElementNode[hgroup, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: hgroup, children: Content*): ElementNode[hgroup, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: hgroup, props: Props[E], children: Content*): ElementNode[hgroup, E] = js.native
}

