package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.kbd
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_kbd extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: kbd): ElementNode[kbd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: kbd, children: Content*): ElementNode[kbd, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: kbd, props: Props[E], children: Content*): ElementNode[kbd, E] = js.native
}

