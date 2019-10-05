package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.col
import typings.std.HTMLTableColElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_col extends js.Object {
  def apply[E /* <: HTMLTableColElement */](`type`: col): ElementNode[col, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: col, children: Content*): ElementNode[col, E] = js.native
  def apply[E /* <: HTMLTableColElement */](`type`: col, props: Props[E], children: Content*): ElementNode[col, E] = js.native
}

