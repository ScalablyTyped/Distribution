package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.map
import typings.std.HTMLMapElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_map extends js.Object {
  def apply[E /* <: HTMLMapElement */](`type`: map): ElementNode[map, E] = js.native
  def apply[E /* <: HTMLMapElement */](`type`: map, children: Content*): ElementNode[map, E] = js.native
  def apply[E /* <: HTMLMapElement */](`type`: map, props: Props[E], children: Content*): ElementNode[map, E] = js.native
}

