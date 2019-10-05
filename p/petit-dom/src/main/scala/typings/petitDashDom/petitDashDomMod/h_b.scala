package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.b
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_b extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: b): ElementNode[b, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: b, children: Content*): ElementNode[b, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: b, props: Props[E], children: Content*): ElementNode[b, E] = js.native
}

