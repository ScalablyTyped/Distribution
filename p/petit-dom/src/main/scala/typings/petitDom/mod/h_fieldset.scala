package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.fieldset
import typings.std.HTMLFieldSetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_fieldset extends js.Object {
  def apply[E /* <: HTMLFieldSetElement */](`type`: fieldset): ElementNode[fieldset, E] = js.native
  def apply[E /* <: HTMLFieldSetElement */](`type`: fieldset, children: Content*): ElementNode[fieldset, E] = js.native
  def apply[E /* <: HTMLFieldSetElement */](`type`: fieldset, props: Props[E], children: Content*): ElementNode[fieldset, E] = js.native
}

