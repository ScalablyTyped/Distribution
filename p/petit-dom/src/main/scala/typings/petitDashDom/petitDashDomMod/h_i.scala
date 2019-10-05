package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.i
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_i extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: i): ElementNode[i, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: i, children: Content*): ElementNode[i, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: i, props: Props[E], children: Content*): ElementNode[i, E] = js.native
}

