package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.div
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_div extends js.Object {
  def apply[E /* <: HTMLDivElement */](`type`: div): ElementNode[div, E] = js.native
  def apply[E /* <: HTMLDivElement */](`type`: div, children: Content*): ElementNode[div, E] = js.native
  def apply[E /* <: HTMLDivElement */](`type`: div, props: Props[E], children: Content*): ElementNode[div, E] = js.native
}

