package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.template
import typings.std.HTMLTemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_template extends js.Object {
  def apply[E /* <: HTMLTemplateElement */](`type`: template): ElementNode[template, E] = js.native
  def apply[E /* <: HTMLTemplateElement */](`type`: template, children: Content*): ElementNode[template, E] = js.native
  def apply[E /* <: HTMLTemplateElement */](`type`: template, props: Props[E], children: Content*): ElementNode[template, E] = js.native
}

