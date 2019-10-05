package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.form
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_form extends js.Object {
  def apply[E /* <: HTMLFormElement */](`type`: form): ElementNode[form, E] = js.native
  def apply[E /* <: HTMLFormElement */](`type`: form, children: Content*): ElementNode[form, E] = js.native
  def apply[E /* <: HTMLFormElement */](`type`: form, props: Props[E], children: Content*): ElementNode[form, E] = js.native
}

