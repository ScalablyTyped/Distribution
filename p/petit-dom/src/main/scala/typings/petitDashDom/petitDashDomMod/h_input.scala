package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.input
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_input extends js.Object {
  def apply[E /* <: HTMLInputElement */](`type`: input): ElementNode[input, E] = js.native
  def apply[E /* <: HTMLInputElement */](`type`: input, children: Content*): ElementNode[input, E] = js.native
  def apply[E /* <: HTMLInputElement */](`type`: input, props: Props[E], children: Content*): ElementNode[input, E] = js.native
}

