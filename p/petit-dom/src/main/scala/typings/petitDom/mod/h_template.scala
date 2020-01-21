package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.template
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

