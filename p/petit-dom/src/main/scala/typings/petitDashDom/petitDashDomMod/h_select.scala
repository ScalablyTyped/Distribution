package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.select
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_select extends js.Object {
  def apply[E /* <: HTMLSelectElement */](`type`: select): ElementNode[select, E] = js.native
  def apply[E /* <: HTMLSelectElement */](`type`: select, children: Content*): ElementNode[select, E] = js.native
  def apply[E /* <: HTMLSelectElement */](`type`: select, props: Props[E], children: Content*): ElementNode[select, E] = js.native
}

