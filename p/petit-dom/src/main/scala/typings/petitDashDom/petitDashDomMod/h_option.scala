package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.option
import typings.std.HTMLOptionElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_option extends js.Object {
  def apply[E /* <: HTMLOptionElement */](`type`: option): ElementNode[option, E] = js.native
  def apply[E /* <: HTMLOptionElement */](`type`: option, children: Content*): ElementNode[option, E] = js.native
  def apply[E /* <: HTMLOptionElement */](`type`: option, props: Props[E], children: Content*): ElementNode[option, E] = js.native
}

