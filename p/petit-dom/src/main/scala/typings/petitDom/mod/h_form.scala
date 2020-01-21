package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.form
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

