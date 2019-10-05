package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.area
import typings.std.HTMLAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_area extends js.Object {
  def apply[E /* <: HTMLAreaElement */](`type`: area): ElementNode[area, E] = js.native
  def apply[E /* <: HTMLAreaElement */](`type`: area, children: Content*): ElementNode[area, E] = js.native
  def apply[E /* <: HTMLAreaElement */](`type`: area, props: Props[E], children: Content*): ElementNode[area, E] = js.native
}

