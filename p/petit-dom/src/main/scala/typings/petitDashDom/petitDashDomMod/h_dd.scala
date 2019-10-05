package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.dd
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dd extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: dd): ElementNode[dd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dd, children: Content*): ElementNode[dd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: dd, props: Props[E], children: Content*): ElementNode[dd, E] = js.native
}

