package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.label
import typings.std.HTMLLabelElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_label extends js.Object {
  def apply[E /* <: HTMLLabelElement */](`type`: label): ElementNode[label, E] = js.native
  def apply[E /* <: HTMLLabelElement */](`type`: label, children: Content*): ElementNode[label, E] = js.native
  def apply[E /* <: HTMLLabelElement */](`type`: label, props: Props[E], children: Content*): ElementNode[label, E] = js.native
}

